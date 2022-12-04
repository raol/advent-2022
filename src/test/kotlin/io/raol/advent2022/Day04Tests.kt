package io.raol.advent2022

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

class Day04Tests {

    @Test
    fun samplePart1() {
        val data = Utils.readResourceFile("day4sample")
        val result = Day04(data).part1()
        Assertions.assertThat(result).isEqualTo(2)
    }

    @Test
    fun solvePart1() {
        val data = Utils.readResourceFile("day4")
        val result = Day04(data).part1()
        Assertions.assertThat(result).isEqualTo(2)
    }

    @Test
    fun samplePart2() {
        val data = Utils.readResourceFile("day4sample")
        val result = Day04(data).part2()
        Assertions.assertThat(result).isEqualTo(4)
    }

    @Test
    fun solvePart2() {
        val data = Utils.readResourceFile("day4")
        val result = Day04(data).part2()
        Assertions.assertThat(result).isEqualTo(2)
    }
}