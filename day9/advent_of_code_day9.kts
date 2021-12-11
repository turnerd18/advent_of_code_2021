import java.io.File
import kotlin.math.abs

val grid =
    File("./input.txt")
        .readLines()
        .map { it.split("").filter { !it.isNullOrEmpty() }.map { it.toInt() } }

fun countBasinPoints(x: Int, y: Int, basinPoints: MutableSet<Pair<Int, Int>>): Int {
    val curr = grid[x][y]
    for (k in listOf(x - 1, x + 1)) {
        if (k < 0 || k >= grid.size) continue
        if (curr < grid[k][y] && grid[k][y] < 9) {
            basinPoints.add(k to y)
            countBasinPoints(k, y, basinPoints)
        }
    }

    for (l in listOf(y - 1, y + 1)) {
        if (l < 0 || l >= grid[x].size) continue
        if (curr < grid[x][l] && grid[x][l] < 9) {
            basinPoints.add(x to l)
            countBasinPoints(x, l, basinPoints)
        }
    }

    return basinPoints.size
}

val minimums = mutableListOf<Int>()
val basinSizes = mutableListOf<Int>()
for (i in 0 until grid.size) {
    for (j in 0 until grid[i].size) {
        val curr = grid[i][j]
        var lowerThanAll = true
        for (k in listOf(i - 1, i + 1)) {
            if (k < 0 || k >= grid.size) continue
            if (!(curr < grid[k][j])) {
                lowerThanAll = false
                break
            }
        }

        for (l in listOf(j - 1, j + 1)) {
            if (l < 0 || l >= grid[i].size) continue
            if (!(curr < grid[i][l])) {
                lowerThanAll = false
                break
            }
        }

        if (lowerThanAll) {
            minimums.add(curr)
            val basinSize = countBasinPoints(i, j, mutableSetOf<Pair<Int, Int>>(i to j))
            basinSizes.add(basinSize)
        }
    }
}

println("Part 1: ${minimums.sumOf { it + 1 }}")

println("Part 2: ${basinSizes.sorted().reversed().take(3).reduce { acc, i -> acc * i }}")
