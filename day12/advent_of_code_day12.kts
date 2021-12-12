import java.io.File

data class Cave(
    val name: String,
    val isSmall: Boolean,
    val connections: MutableList<Cave> = mutableListOf<Cave>()
) {
    override fun toString(): String = "$name | isSmall=$isSmall | connections=${connections.size}"
}

val caveNameMap = mutableMapOf<String, Cave>()
lateinit var start: Cave
//val FILE_NAME = "example"
//val FILE_NAME = "example_tiny"
//val FILE_NAME = "example_large"
val FILE_NAME = "input"
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

var allowRevisit = false

fun countPaths(
    cave: Cave,
    smallCaveVisits: Set<String> = setOf(),
    didRevisitSmallCave: Boolean = false,
    caveChain: List<String> = listOf()
): Set<String> {
    if (cave.name == "end") {
//        println("${caveChain.joinToString(",")},end")// | $smallCaveVisits")
        return setOf(caveChain.joinToString(","))
    }

    val nextSmallVisits = if (cave.isSmall) smallCaveVisits.plus(cave.name) else smallCaveVisits

    var paths = mutableSetOf<String>()
    for (nextCave in cave.connections.filterNot { it.name in smallCaveVisits }) {
        paths += countPaths(
            nextCave,
            nextSmallVisits,
            didRevisitSmallCave,
            caveChain.plus(cave.name)
        )
    }
    if (allowRevisit && !didRevisitSmallCave && cave.isSmall && cave != start) {
        for (nextCave in cave.connections.filterNot { it.name in smallCaveVisits }) {
            paths += countPaths(nextCave, smallCaveVisits, true, caveChain.plus(cave.name))
        }
    }
    return paths
}

println("Part 1: ${countPaths(start).size}")

allowRevisit = true
println("Part 2: ${countPaths(start).size}")
