//val fishAges = mutableListOf(3,4,3,1,2)
val fishAges = listOf(2,5,5,3,2,2,5,1,4,5,2,1,5,5,1,2,3,3,4,1,4,1,4,4,2,1,5,5,3,5,4,3,4,1,5,4,1,5,5,5,4,3,1,2,1,5,1,4,4,1,4,1,3,1,1,1,3,1,1,2,1,3,1,1,1,2,3,5,5,3,2,3,3,2,2,1,3,1,3,1,5,5,1,2,3,2,1,1,2,1,2,1,2,2,1,3,5,4,3,3,2,2,3,1,4,2,2,1,3,4,5,4,2,5,4,1,2,1,3,5,3,3,5,4,1,1,5,2,4,4,1,2,2,5,5,3,1,2,4,3,3,1,4,2,5,1,5,1,2,1,1,1,1,3,5,5,1,5,5,1,2,2,1,2,1,2,1,2,1,4,5,1,2,4,3,3,3,1,5,3,2,2,1,4,2,4,2,3,2,5,1,5,1,1,1,3,1,1,3,5,4,2,5,3,2,2,1,4,5,1,3,2,5,1,2,1,4,1,5,5,1,2,2,1,2,4,5,3,3,1,4,4,3,1,4,2,4,4,3,4,1,4,5,3,1,4,2,2,3,4,4,4,1,4,3,1,3,4,5,1,5,4,4,4,5,5,5,2,1,3,4,3,2,5,3,1,3,2,2,3,1,4,5,3,5,5,3,2,3,1,2,5,2,1,3,1,1,1,5,1)

//val END = 18
//val END = 80
val END = 256
val fishQueue = fishAges.map { it to END }.toMutableList()
val fishCreatedMap = mutableMapOf<Pair<Int, Int>, Double>()

fun countFishCreated(fish: Pair<Int, Int>): Double {
    if (fish in fishCreatedMap) {
        return fishCreatedMap[fish]!!
    }

    var fishCreated: Double = 0.0
    var cur = fish.first
    for (i in fish.second - 1 downTo 0) {
        if (cur == 0) {
            cur = 6
            fishCreated += 1.0
            fishCreated += countFishCreated(8 to i)
        } else {
            cur -= 1
        }
    }
    fishCreatedMap[fish] = fishCreated
    return fishCreated
}

val fishCount = fishQueue.map { countFishCreated(it) }.sum() + fishQueue.size.toDouble()
println(fishCount)
