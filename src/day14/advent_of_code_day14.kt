package day14

import java.io.File

//const val FILE = "example.txt"
const val FILE = "input.txt"

fun main() {
    val (template, mapping) = parseInputFile()
    val memos = mutableMapOf<List<Any>, Map<Char, Double>>()

    fun countRec(chars: List<Char>, step: Int): Map<Char, Double> {
        if (step == 0) return mapOf(chars[1] to 1.0)

        val memoKey = listOf<Any>(*chars.toTypedArray(), step)
        memos[memoKey]?.let { return@countRec it }

        val nextChar = mapping[chars[0] to chars[1]]!!

        val firstPairCounts = countRec(listOf(chars[0], nextChar), step - 1)
        val secondPairCounts = countRec(listOf(nextChar, chars[1]), step - 1)

        val letterCounts = mutableMapOf<Char, Double>()
        for ((char, count) in firstPairCounts.entries.toList() + secondPairCounts.entries.toList()) {
            letterCounts[char] = (letterCounts[char] ?: 0.0) + count
        }

        memos[memoKey] = letterCounts
        return letterCounts
    }

    val counts = mutableMapOf<Char, Double>()
    counts[template[0]] = 1.0
    for (i in 1 until template.length) {
        val pairCounts = countRec(listOf(template[i - 1], template[i]), 40)
        for ((char, count) in pairCounts) {
            counts[char] = (counts[char] ?: 0.0) + count
        }
    }

    val sortedGroupings = counts.values.sorted()
    println(counts)
    println("Part 2: ${sortedGroupings.last() - sortedGroupings.first()}")
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
