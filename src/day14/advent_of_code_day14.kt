package day14

import java.io.File

//const val FILE = "example.txt"
const val FILE = "input.txt"

fun main() {
    val (template, mapping) = parseInputFile()

    var nextTemplate = template
    val x = nextTemplate[0]
    for (step in 0 until 10) {
        val stepTemplate = mutableListOf(nextTemplate[0])
        for (i in 1 until nextTemplate.length) {
            stepTemplate.add(mapping[nextTemplate[i - 1] to nextTemplate[i]]!!)
            stepTemplate.add(nextTemplate[i])
        }
        nextTemplate = stepTemplate.joinToString("")
    }
//    println(nextTemplate)

    val sortedGroupings = nextTemplate.groupBy { it }.values.sortedBy { it.size }
    println(nextTemplate.length)
    println(sortedGroupings.map { it.first() to it.size })
    println("Part 1: ${sortedGroupings.last().size - sortedGroupings.first().size}")
}

data class PuzzleInput(
        val template: String,
        val mapping: Map<Pair<Char, Char>, Char>
)

private fun parseInputFile(): PuzzleInput {
    val reader = File("./text_inputs/day14/$FILE").bufferedReader()
    val iterator = reader.lineSequence().iterator()

    val template = iterator.next()
    iterator.next()

    val mapping = mutableMapOf<Pair<Char, Char>, Char>()
    while (iterator.hasNext()) {
        val lineSplit = iterator.next().split(" -> ")
        val comboSplit = lineSplit[0].split("").filterNot { it.isEmpty() }
        mapping[comboSplit[0][0] to comboSplit[1][0]] = lineSplit[1][0]
    }
    reader.close()

    return PuzzleInput(template, mapping)
}
