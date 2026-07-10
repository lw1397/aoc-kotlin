package aoc_2025

interface AocSolution<T, R> {

    val formatted: T

    fun format(): T
    fun solvePart1(): R
    fun solvePart2(): R
}