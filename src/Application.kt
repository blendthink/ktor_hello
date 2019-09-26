package div.honwakalab.hello

import io.ktor.application.*
import io.ktor.response.respondFile
import io.ktor.routing.get
import io.ktor.routing.routing
import java.io.File

fun main(args: Array<String>): Unit = io.ktor.server.netty.EngineMain.main(args)

@Suppress("unused") // Referenced in application.conf
@kotlin.jvm.JvmOverloads
fun Application.module(testing: Boolean = false) {

    routing {
        get("/") {
            call.respondFile(File("./resources/hello.html"))
        }
    }
}

