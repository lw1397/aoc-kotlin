package aoc_2025

class Day02(val input: String): AocSolution<List<Long>, Long> {
    override val formatted: List<Long> = this.format()


    override fun format(): List<Long> =
        input.split(',')
            .flatMap { range ->
                range.split('-').let {
                    it[0].toLong()..it[1].toLong()
                }
            }

    override fun solvePart1(): Long =
        formatted
            .filter {
                val num = it.toString()
                num.length % 2 != 1 && num.substring(0, num.length / 2) == num.substring(num.length / 2)
            }.sum()

    override fun solvePart2(): Long =
        formatted.filter {
            val num = it.toString()
            (1..num.length/2).any { n ->
                num.windowed(n, n, true).let { windows ->
                    windows.size == 1 || windows.all { it == windows.first() }
                }
            }
        }.sum()

}