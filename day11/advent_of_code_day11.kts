import java.io.File

val grid =
    File("./input.txt")
        .readLines()
        .map { it.split("").filter { !it.isNullOrEmpty() }.map { it.toInt() } }

data class Octopus(
    var energy: Int,
    val neighbors: MutableList<Octopus>,
    var flashStep: Int? = null
)

fun buildOctopuses(): List<Octopus> {
    val octopusPositions = mutableMapOf<Pair<Int, Int>, Octopus>()
    for (row in 0 until grid.size) {
        for (cell in 0 until grid[row].size) {
            val octopus =
                octopusPositions[row to cell] ?: Octopus(grid[row][cell], mutableListOf<Octopus>())

            for (i in row - 1..row + 1) {
                if (i < 0 || i >= grid.size) continue

                for (j in cell - 1..cell + 1) {
                    if (j < 0 || j >= grid[row].size || (row == i && cell == j)) continue

                    val neighbor =
                        octopusPositions[i to j] ?: Octopus(grid[i][j], mutableListOf<Octopus>())
                    octopus.neighbors.add(neighbor)
                    octopusPositions[i to j] = neighbor
                }
            }

            octopusPositions[row to cell] = octopus
        }
    }

    return octopusPositions.values.toList()
}

val octopuses = buildOctopuses()
var flashes = 0

fun stepUpOctopus(octopus: Octopus, step: Int) {
    if (octopus.flashStep == step) return

    if (octopus.energy < 9) {
        octopus.energy += 1
        return
    }

    flashes += 1
    octopus.flashStep = step
    octopus.energy = 0
    for (neighbor in octopus.neighbors) {
        stepUpOctopus(neighbor, step)
    }
}

var step = 0
for (i in 1..100) {
    step = i
    for (octopus in octopuses) {
        stepUpOctopus(octopus, step)
    }
}

println("Part 1: $flashes flashes")

while (octopuses.count { it.flashStep == step } != octopuses.size) {
    step += 1
    for (octopus in octopuses) {
        stepUpOctopus(octopus, step)
    }
}

println("Part 2: All flash at step ${octopuses[0].flashStep}")
