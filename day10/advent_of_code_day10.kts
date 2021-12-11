import java.io.File

val subsystem =
    File("./input.txt")
        .readLines()
        .map { it.split("").filter { !it.isNullOrEmpty() } }

val blockStarts = listOf("(", "[", "{", "<")
val blockEnds = listOf(")", "]", "}", ">")
val blockStartMap = blockEnds.zip(blockStarts).toMap()
val blockEndMap = blockEnds.zip(listOf(3, 57, 1197, 25137)).toMap()
val completionMapPoints = blockStarts.zip((1..4)).toMap()

var corruptPoints = 0
val completionScores = mutableListOf<Double>()
for (line in subsystem) {
    val stack = mutableListOf<String>()
    var lineIsCorrupt = false
    for (s in line) {
        if (s in blockStarts) {
            stack.add(s)
            continue
        }

        val validBlockStart = blockStartMap[s]
        if (stack.removeLast() != validBlockStart) {
            corruptPoints += blockEndMap[s]!!
            lineIsCorrupt = true
            break
        }
    }

    if (lineIsCorrupt) continue

    val completionScore =
        stack.reversed().fold(0.0, { acc, s -> (5.0 * acc) + completionMapPoints[s]!! })
    completionScores.add(completionScore)
}

println("Part 1: $corruptPoints")

val medianScore = completionScores.sorted()[completionScores.size / 2]
println("Part 2: $medianScore")
