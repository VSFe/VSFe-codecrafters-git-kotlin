package command

import java.io.File

fun runInit() {
    val gitDir = File(".git")
    gitDir.mkdirs()

    File(gitDir, "objects").mkdir()
    File(gitDir, "refs").mkdir()
    File(gitDir, "HEAD").writeText("ref: refs/heads/master\n")

    println("Initialized git directory")
}