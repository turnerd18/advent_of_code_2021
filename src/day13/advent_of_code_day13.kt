package day13

import java.io.File

//const val FILE = "example.txt"
const val FILE = "input.txt"

enum class Dimension { X, Y }

fun main() {
    val (coordinates, folds) = parseInputFile()
    println("${coordinates.size} coords | ${folds.size} folds")

    var i = 0
    for ((x, y) in folds) {
        print(x)
    }
}

data class ParseResults(val coordinates: List<Pair<Int, Int>>, val folds: List<Pair<Dimension, Int>>)

private fun parseInputFile(): ParseResults {
    val reader = File("./text_inputs/day13/$FILE").bufferedReader()
    val iterator = reader.lineSequence().iterator()
    val coordinates = mutableListOf<Pair<Int, Int>>()
    val folds = mutableListOf<Pair<Dimension, Int>>()
    var endOfCoordsReached = false
    while (iterator.hasNext()) {
        val line = iterator.next()
        if (line.trim().isBlank()) {
            endOfCoordsReached = true
            continue
        }

        if (!endOfCoordsReached) {
            val lineSplit = line.split(",")
            coordinates.add(lineSplit[0].toInt() to lineSplit[1].toInt())
        } else {
            val lineSplit = line.split("=")
            val dimension = if (lineSplit[0].endsWith("x")) Dimension.X else Dimension.Y
            folds.add(dimension to lineSplit[1].toInt())
        }
    }
    reader.close()

    return ParseResults(coordinates, folds)
}