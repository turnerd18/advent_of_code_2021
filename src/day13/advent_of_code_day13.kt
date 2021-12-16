package day13

import java.io.File

//const val FILE = "example.txt"
const val FILE = "input.txt"

enum class Dimension { X, Y }

fun main() {
    val (coordinates, folds) = parseInputFile()
    println("${coordinates.size} coords | ${folds.size} folds")

    var i = 0
    var foldedCoordinates = coordinates
    for ((dimension, units) in folds) {
        println("$dimension | $units")
        foldedCoordinates = foldedCoordinates.map { (x, y) ->
            when (dimension) {
                Dimension.X -> {
                    val newX = if (x < units) x else x - ((x - units) * 2)
                    Coordinates(newX, y)
                }
                Dimension.Y -> {
                    val newY = if (y < units) y else y - ((y - units) * 2)
                    Coordinates(x, newY)
                }
            }
        }.toSet().toList()
        if (i == 0) {
            println("Part 1: ${foldedCoordinates.size} dots")
            println(foldedCoordinates)
        }

        i += 1
    }

    val maxX = foldedCoordinates.maxOf { it.x }
    val maxY = foldedCoordinates.maxOf { it.y }
    val grid = (0..maxX).map { (0..maxY).map { " " }.toMutableList() }
    for ((x, y) in foldedCoordinates) {
        grid[x][y] = "#"
    }
    grid.forEach { println(it.joinToString("")) }
    // PART 2 ANSWER: CJCKBAPB
}

data class Coordinates(val x: Int, val y: Int)

data class ParseResults(
    val coordinates: List<Coordinates>,
    val folds: List<Pair<Dimension, Int>>
)

private fun parseInputFile(): ParseResults {
    val reader = File("./text_inputs/day13/$FILE").bufferedReader()
    val iterator = reader.lineSequence().iterator()
    val coordinates = mutableListOf<Coordinates>()
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
            coordinates.add(Coordinates(lineSplit[0].toInt(), lineSplit[1].toInt()))
        } else {
            val lineSplit = line.split("=")
            val dimension = if (lineSplit[0].endsWith("x")) Dimension.X else Dimension.Y
            folds.add(dimension to lineSplit[1].toInt())
        }
    }
    reader.close()

    return ParseResults(coordinates, folds)
}
