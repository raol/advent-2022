package io.raol.advent2022

import java.io.File

internal object Utils {
    fun readResourceFile(fileName : String): String =
        this::class.java.classLoader.getResource(fileName).readText()

    fun linebreak() = System.getProperty("line.separator")
}