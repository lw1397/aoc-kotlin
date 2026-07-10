package test.aoc2025

import Resources.resourceAsListOfString
import Resources.resourceAsText
import aoc_2025.Day01
import aoc_2025.Day02
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test

@DisplayName("Day 1, 2025")
class Day02Test {
    @Nested
    @DisplayName("Part 1")
    inner class Part1 {
        @Test
        fun `Matches example`() {
            val answer = Day02(resourceAsText("files2025/day02_example.txt")).solvePart1()

            assertThat(answer).isEqualTo(1227775554L)
        }

        @Test
        fun `Actual answer`() {
            val answer = Day02(resourceAsText("files2025/day02.txt")).solvePart1()

            assertThat(answer).isEqualTo(40055209690L)
        }

    }

    @Nested
    @DisplayName("Part 2")
    inner class Part2 {
        @Test
        fun `Matches example`() {
            val answer = Day02(resourceAsText("files2025/day02_example.txt")).solvePart2()

            assertThat(answer).isEqualTo(4174379265L)
        }

        @Test
        fun `Actual answer`() {
            val answer = Day02(resourceAsText("files2025/day02.txt")).solvePart2()

            assertThat(answer).isEqualTo(50857215650L)
        }

    }
}