package io.raol.advent2022

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

class Day06Tests {

    @Test
    fun samplePart1() {
        val data = Utils.readResourceFile("day6sample")
        val result = Day06(data).part1()
        Assertions.assertThat(result).isEqualTo(7)
    }

    @Test
    fun solvePart1() {
        val data = Utils.readResourceFile("day6")
        val result = Day06(data).part1()
        Assertions.assertThat(result).isEqualTo(1238)
    }

    @Test
    fun samplePart2() {
        val data = Utils.readResourceFile("day6sample")
        val result = Day06(data).part2()
        Assertions.assertThat(result).isEqualTo(19)
    }

    @Test
    fun solvePart2() {
        val data = Utils.readResourceFile("day6")
        val result = Day06(data).part2()
        Assertions.assertThat(result).isEqualTo(3037)
    }
}