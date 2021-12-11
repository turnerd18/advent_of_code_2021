import java.io.File
import kotlin.math.abs

data class Note(val digitPatterns: List<String>, val outputs: List<String>)

val grid =
    File("./input.txt")
        .readLines()
        .map { it.split("").filter { !it.isNullOrEmpty() }.map { it.toInt() } }

val minimums = mutableListOf<Int>()
for (i in 0 until grid.size) {
    for (j in 0 until grid[i].size) {
        val curr = grid[i][j]
        var lowerThanAll = true
//        println("$curr | ${i - 1..i + 1} | ${j - 1..j + 1}")
        for (k in i - 1..i + 1) {
//            if (!lowerThanAll) break

            if (k < 0 || k >= grid.size) continue

            for (l in j - 1..j + 1) {
                if (l < 0 || l >= grid[i].size || (i == k && j == l)) continue
                if (abs(k-i) +abs(l-j) > 1) continue
                print(grid[k][l])

                if ( !(curr < grid[k][l])) {
                    lowerThanAll = false
//                    break
                }
            }
        }

//        println()
        if (lowerThanAll) {
            print(" | MATCHED: $curr")
            minimums.add(curr)
        }
        println()
    }
}

println(minimums.sumOf { it + 1 })
