import command.GitCommand
import command.runInit
import java.io.File
import java.util.*
import kotlin.system.exitProcess

fun main(args: Array<String>) {
    // You can use print statements as follows for debugging, they'll be visible when running tests.
    System.err.println("Logs from your program will appear here!")

    if (args.isEmpty()) {
        println("Usage: your_program.sh <command> [<args>]")
        exitProcess(1)
    }

    when (args[0]) {
        GitCommand.INIT.command -> runInit()
        else -> {
            println("Unknown command: ${args[0]}")
            exitProcess(1)
        }
    }
}
