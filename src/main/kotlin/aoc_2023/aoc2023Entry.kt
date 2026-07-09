package aoc_2023

import fileName
import main.kotlin.aoc_2023.aoc1_23.aoc1P1_23
import main.kotlin.aoc_2023.aoc1_23.aoc1P2_23
import main.kotlin.aoc_2023.aoc2_23.aoc2P1_23
import main.kotlin.aoc_2023.aoc2_23.aoc2P2_23

fun aoc2023() {
    aoc1P1_23(input = fileName(problem = 1, year = 2023))
    aoc1P2_23(input = fileName(problem = 1, year = 2023))

    aoc2P1_23(input = fileName(problem = 2, year = 2023))
    aoc2P2_23(input = fileName(problem = 2, year = 2023))
}