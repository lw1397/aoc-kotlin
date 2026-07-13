package aoc_2025

class Day03(val input: List<String>): AocSolution<List<List<Int>>, Long> {
    override val formatted = format()
    override fun format(): List<List<Int>> = input.map {
        it.toCharArray().map { it.digitToInt() }
    }

    override fun solvePart1(): Long =
        formatted.sumOf { line ->
            line.drop(2).fold(Pair(line[0], line[1])) { initial, next ->
                when {
                    initial.first < initial.second -> Pair(initial.second, next)
                    initial.second < next -> Pair(initial.first, next)
                    else -> initial
                }
            }.let { "${it.first}${it.second}".toLong() }
        }


    override fun solvePart2(): Long =
        formatted.sumOf { line ->
            line.drop(12).fold(line.take(12)) { initial, next ->
                // make the whole list including the new one
                val intermediate = initial + next

                for (i in 0..<intermediate.size-1) {
                    // whenever you run into current < next, remove current and break/continue
                    if (intermediate[i] < intermediate[i+1]) {
                        return@fold intermediate.subList(0, i) + intermediate.subList(i + 1, intermediate.size)
                    }
                }
                // if you get all the way through without returning, remove the last one and continue
                initial
            }.joinToString(separator = "").toLong()
        }
}