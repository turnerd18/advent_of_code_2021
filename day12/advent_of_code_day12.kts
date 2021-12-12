import java.io.File

data class Cave(
    val name: String,
    val isSmall: Boolean,
    val connections: MutableList<Cave> = mutableListOf<Cave>()
) {
    override fun toString(): String = "$name | isSmall=$isSmall | connections=${connections.size}"
    val isSingle: Boolean get() = connections.any { it.isSmall }
}

val caveNameMap = mutableMapOf<String, Cave>()
lateinit var start: Cave
//val FILE_NAME = "example"
val FILE_NAME = "example_tiny"
//val FILE_NAME = "example_large"
//val FILE_NAME = "input"
File("./$FILE_NAME.txt")
    .readLines()
    .map { it.split("-").filter { !it.isNullOrEmpty() } }
    .forEach {
        val cave1 = caveNameMap.getOrPut(it[0]) { Cave(it[0], it[0].all { it.isLowerCase() }) }
        val cave2 = caveNameMap.getOrPut(it[1]) { Cave(it[1], it[1].all { it.isLowerCase() }) }
        cave1.connections.add(cave2)
        cave2.connections.add(cave1)
        if (cave1.name == "start") start = cave1
        if (cave2.name == "start") start = cave2
    }

//data class Success()
//data class


fun countPaths(
    cave: Cave,
    maxSmallVisits: Int,
    smallCaveVisits: Map<String, Int> = mapOf(),
    caveChain: List<String> = listOf()
): Int {
    if (cave.name == "end") {
        println("$caveChain | $smallCaveVisits")
        return 1
    }

    val nextSmallVisits = smallCaveVisits.toMutableMap()
    if (cave.isSmall) {
        nextSmallVisits[cave.name] = (nextSmallVisits[cave.name] ?: 0) + 1
    }

    var pathsToEnd = 0
    for (nextCave in cave.connections) {
        if (nextCave.isSmall) {
            val nextSmallCaveVisits = smallCaveVisits[nextCave.name] ?: 0
            val maxVisits = if (nextCave.isSingle) maxSmallVisits else 1
            if (nextSmallCaveVisits >= maxVisits) continue
        }
        pathsToEnd += countPaths(
            nextCave,
            maxSmallVisits,
            nextSmallVisits,
            caveChain.plus(cave.name)
        )
    }
    return pathsToEnd
}

println("Part 1: ${countPaths(start, 1, mapOf("start" to 1))}")
println("Part 2: ${countPaths(start, 2, mapOf("start" to 2))}")
