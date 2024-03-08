package org.example

// For teachers: Start only with class Rental. Open for inheritance later
// open makes it available for inheritance
open class Rental(private val loader: PriceLoader, public val city: String, private val sizeInSquareMeters: Double) {
    open var totalPrice: Double =  0.0 // need to be initialized when open

    init {
        val averagePricePerSquareMeter = loader.getAveragePrice(city)
        totalPrice = averagePricePerSquareMeter * sizeInSquareMeters
    }
}


// Part 2: Inheritance
class CommercialRental(loader: PriceLoader, city: String, sizeInSquareMeters: Double, private val leaseLengthYears: Int) : Rental(loader, city, sizeInSquareMeters) {
    // Initialize totalPrice based on additional factors specific to CommercialRental
    init {
        totalPrice = calculateTotalPrice()
    }

    private fun calculateTotalPrice(): Double {
        // Assuming a different calculation for commercial rentals
        return super.totalPrice * leaseLengthYears
    }
}

class ResidentialRental(loader: PriceLoader, city: String, sizeInSquareMeters: Double, private val monthlyMaintenanceFee: Double) : Rental(loader, city, sizeInSquareMeters) {
    // Initialize totalPrice based on additional factors specific to ResidentialRental
    init {
        totalPrice = calculateTotalPrice()
    }

    private fun calculateTotalPrice(): Double {
        // Assuming a different calculation for residential rentals
        return super.totalPrice + (monthlyMaintenanceFee * 12)
    }
}
