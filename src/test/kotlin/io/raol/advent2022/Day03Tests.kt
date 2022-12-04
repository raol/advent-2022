package io.raol.advent2022

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

class Day03Tests {

    @Test
    fun samplePart1() {
        val data = Utils.readResourceFile("day3sample")
        val result = Day03(data).part1()
        Assertions.assertThat(result).isEqualTo(157)
    }

    @Test
    fun solvePart1() {
        val data = Utils.readResourceFile("day3")
        val result = Day03(data).part1()
        Assertions.assertThat(result).isEqualTo(7597)
    }

    @Test
    fun samplePart2() {
        val data = Utils.readResourceFile("day3sample")
        val result = Day03(data).part2()
        Assertions.assertThat(result).isEqualTo(70)
    }

    @Test
    fun solvePart2() {
        val data = Utils.readResourceFile("day3")
        val result = Day03(data).part2()
        Assertions.assertThat(result).isEqualTo(2607)
    }


}