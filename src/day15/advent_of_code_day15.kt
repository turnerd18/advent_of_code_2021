package day15

import java.io.File
import kotlin.math.min

//const val FILE = "example.txt"
const val FILE = "input.txt"

data class RiskSpace(val x: Int, val y: Int, val risk: Int)

fun main() {
    val (grid) = parseInputFile()
    val bottomEdge = grid.size - 1
    val rightEdge = grid[grid.size - 1].size - 1
    val riskMemos = mutableMapOf<RiskSpace, Int>()

    fun calcMinRisk(riskSpace: RiskSpace, visited: Set<RiskSpace>): Int {
        val (x, y, risk) = riskSpace

        riskMemos[riskSpace]?.let { return@calcMinRisk it }

        val nextVisited = visited.plus(riskSpace)

        val minRisk = if (x == bottomEdge && y == rightEdge) { // end
            0
        } else if (y == rightEdge) {
            val leftRisk = if (grid[x][y - 1] in visited) Int.MAX_VALUE else calcMinRisk(grid[x][y - 1], nextVisited)
            val downRisk = if (grid[x + 1][y] in visited) Int.MAX_VALUE else calcMinRisk(grid[x + 1][y], nextVisited)
            min(leftRisk, downRisk)
        } else if (x == bottomEdge) {
            calcMinRisk(grid[x][y + 1], nextVisited)
        } else if (y == 0) { // left edge
            val rightRisk = if (grid[x][y + 1] in visited) Int.MAX_VALUE else calcMinRisk(grid[x][y + 1], nextVisited)
            val downRisk = if (grid[x + 1][y] in visited) Int.MAX_VALUE else calcMinRisk(grid[x + 1][y], nextVisited)
            min(rightRisk, downRisk)
        } else {
            val leftRisk = if (grid[x][y - 1] in visited) Int.MAX_VALUE else calcMinRisk(grid[x][y - y], nextVisited)
            val rightRisk = if (grid[x][y + 1] in visited) Int.MAX_VALUE else calcMinRisk(grid[x][y + 1], nextVisited)
            val downRisk = if (grid[x + 1][y] in visited) Int.MAX_VALUE else calcMinRisk(grid[x + 1][y], nextVisited)

            minOf(rightRisk, downRisk, leftRisk)
        }
        riskMemos[riskSpace] = minRisk + risk
        return minRisk + risk
    }

    val rightRisk = calcMinRisk(grid[0][1], setOf(grid[0][0]))
    val downRisk = calcMinRisk(grid[1][0], setOf(grid[0][0]))
    println("Part 1: ${min(rightRisk, downRisk)}")


//    println("Part 2: ${sortedGroupings.last() - sortedGroupings.first()}")
}

data class PuzzleInput(val grid: List<List<RiskSpace>>)

private fun parseInputFile(): PuzzleInput {
    val grid = File("./text_inputs/day15/$FILE")
            .readLines()
            .mapIndexed { x, line ->
                line.split("")
                        .filterNot { it.isEmpty() }
                        .mapIndexed { y, it -> RiskSpace(x, y, it.toInt()) }
            }
    return PuzzleInput(grid)
}
