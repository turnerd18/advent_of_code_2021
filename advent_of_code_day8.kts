import java.io.File

data class Note(val digitPatterns: List<String>, val outputs: List<String>)

val notes = File("./advent_of_code_day8.txt").readLines().map {
    val split = it.split(" | ")
    Note(split[0].split(" ").map { it.toCharArray().sorted().joinToString("") },
        split[1].split(" ").map { it.toCharArray().sorted().joinToString("") })
}

var part1Count = 0
for (note in notes) {
    part1Count += note.outputs.count { it.length in setOf(2, 3, 4, 7) }
}

println("Part 1: $part1Count")

val outputValues = mutableListOf<Int>()

for (note in notes) {
    val onePattern = note.digitPatterns.first { it.length == 2 }
    val fourPattern = note.digitPatterns.first { it.length == 4 }
    val sevenPattern = note.digitPatterns.first { it.length == 3 }
    val eightPattern = note.digitPatterns.first { it.length == 7 }
    val patternMap =
        mutableMapOf(onePattern to 1, fourPattern to 4, sevenPattern to 7, eightPattern to 8)

    val ninePattern =
        note.digitPatterns.first {
            it.length == 6 && it.toSet().union(fourPattern.toSet()).size == 6
        }
    patternMap[ninePattern] = 9

    val fourHook = fourPattern.toSet() - onePattern.toSet()
    val sixPattern = note.digitPatterns.first {
        it.length == 6 && it != ninePattern && fourHook.union(it.toSet()).size == it.length
    }
    patternMap[sixPattern] = 6

    val zeroPattern =
        note.digitPatterns.first { it.length == 6 && it != ninePattern && it != sixPattern }
    patternMap[zeroPattern] = 0

    val threePattern = note.digitPatterns.first {
        it.length == 5 && it.toSet().union(onePattern.toSet()).size == 5
    }
    patternMap[threePattern] = 3

    val fivePattern =
        note.digitPatterns.first { it.length == 5 && fourHook.union(it.toSet()).size == it.length }
    patternMap[fivePattern] = 5

    val twoPattern = note.digitPatterns.first { !patternMap.containsKey(it) }
    patternMap[twoPattern] = 2

//    println(patternMap)

    val output = note.outputs.map { patternMap.get(it)?.toString() ?: '?' }.joinToString("")
    outputValues.add(output.toInt())
}

println("Part 2: ${outputValues.sum()}")