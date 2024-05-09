package com.tiagodavi70

import io.ktor.client.*
import io.ktor.client.request.*
import io.ktor.client.statement.*

suspend fun main() {

    val client:HttpClient = HttpClient()
    val resposta: HttpResponse = client.get("https://ktor.io")
    print(resposta.status)
    print(resposta.bodyAsText())
    client.close()
}