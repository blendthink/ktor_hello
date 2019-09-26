package div.honwakalab.hello

import io.ktor.application.*
import io.ktor.http.content.resource
import io.ktor.routing.routing

fun main(args: Array<String>): Unit = io.ktor.server.netty.EngineMain.main(args)

@Suppress("unused") // Referenced in application.conf
@kotlin.jvm.JvmOverloads
fun Application.module(testing: Boolean = false) {

    routing {

        resource("/", "hello.html")
    }
}

