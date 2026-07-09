package test.aoc2025

import Resources.resourceAsListOfString
import aoc_2025.Day01
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test

@DisplayName("Day 1, 2025")
class Day01Test {
    @Nested
    @DisplayName("Part 1")
    inner class Part1 {
        @Test
        fun `Matches example`() {
            val answer = Day01(resourceAsListOfString("files2025/day01_example.txt")).solvePart1()

            assertThat(answer).isEqualTo(3L)
        }

        @Test
        fun `Actual answer`() {
            val answer = Day01(resourceAsListOfString("files2025/day01.txt")).solvePart1()

            assertThat(answer).isEqualTo(1007L)
        }

    }

    @Nested
    @DisplayName("Part 2")
    inner class Part2 {
        @Test
        fun `Matches example`() {
            val answer = Day01(resourceAsListOfString("files2025/day01_example.txt")).solvePart2()

            assertThat(answer).isEqualTo(6)
        }

        @Test
        fun `Actual answer`() {
            val answer = Day01(resourceAsListOfString("files2025/day01.txt")).solvePart2()

            assertThat(answer).isEqualTo(5820)
        }

    }
}