package aoc_2025

class Day01(val input: List<String>): AocSolution<List<String>, Int> {

    override val formatted = input
    override fun format(): List<String> = input

    override fun solvePart1(): Int =
        input.runningFold(50) { start, instruction ->
            val number = instruction.substring(1).toInt()
            val direction = if (instruction[0] == 'L') -1 else 1
            (start + (number * direction)).mod(100)
        }.count { it == 0 }

    override fun solvePart2(): Int =
        input.fold(Pair(50, 0)) { (dial, zeros), instruction ->
            val rotation = if (instruction[0] == 'L') instruction.substring(1).toInt() * -1 else instruction.substring(1).toInt()
            val rotationsPastZero = if (rotation > 0) {
                (dial + rotation) / 100
            } else {
                when (dial) {
                    0 -> (rotation) / -100
                    else -> (-rotation - dial + 100) / 100
                }
            }
            Pair(
                (dial + rotation).mod(100),
                zeros + rotationsPastZero
            )
        }.second
}
