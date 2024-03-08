package org.example
import java.io.File

class PriceLoader(private val filename: String) {
    private val prices = mutableMapOf<String, List<Double>>()

    fun load() {
        val file = File(filename)
        val lines = file.readLines().drop(1)  // Skip the header line
        lines.forEach { line ->
            val parts = line.split(",")
            val city = parts[0]
            val priceValues = parts.drop(1).map { it.trim().toDouble() }  // Convert price strings to Double, assuming the first value is the most recent price
            prices[city] = priceValues
        }
    }

    fun getCitiesList(): MutableSet<String> {
        return prices.keys
    }

    fun getAveragePrice(city: String): Double {
        val cityPrices = prices[city] ?: return 0.0  // Return 0.0 if the city is not found
        return cityPrices.average()
    }

    fun getLastPrice(city: String): Double? {
        return prices[city]?.firstOrNull()  // Get the most recent price, assuming it's the first in the list
    }

}
