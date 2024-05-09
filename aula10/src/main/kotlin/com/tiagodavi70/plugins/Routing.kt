package com.tiagodavi70.plugins

import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.request.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import java.io.File

fun Application.configureRouting() {
    routing {
        get("/respondetexto") {
            call.respondText("Hello World!")
        }
        get("/") {
            call.respondFile(File("paginas/index.html"))
        }
        get("/formulario") {
            call.respondFile(File("paginas/formulario.html"))
        }
        post("/formulario") {
            val parametros:Parameters = call.receiveParameters()
            val nome = parametros["nome"]
            val email = parametros["email"]
            //...
            call.respondText { "Submissão feita com sucesso! " +
                    "${nome} ${email}" }
        }
    }
}
