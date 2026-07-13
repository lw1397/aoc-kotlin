package test.aoc2025

import Resources.resourceAsListOfString
import aoc_2025.Day04
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test

@DisplayName("Day 1, 2025")
class Day04Test {
    @Nested
    @DisplayName("Part 1")
    inner class Part1 {
        @Test
        fun `Matches example`() {
            val answer = Day04(resourceAsListOfString("files2025/day04_example.txt")).solvePart1()

            assertThat(answer).isEqualTo(357L)
        }

        @Test
        fun `Actual answer`() {
            val answer = Day04(resourceAsListOfString("files2025/day04.txt")).solvePart1()

            assertThat(answer).isEqualTo(17452L)
        }

    }

    @Nested
    @DisplayName("Part 2")
    inner class Part2 {
        @Test
        fun `Matches example`() {
            val answer = Day04(resourceAsListOfString("files2025/day04_example.txt")).solvePart2()

            assertThat(answer).isEqualTo(3121910778619L)
        }

        @Test
        fun `Actual answer`() {
            val answer = Day04(resourceAsListOfString("files2025/day04.txt")).solvePart2()

            assertThat(answer).isEqualTo(173300819005913L)
        }

    }
}