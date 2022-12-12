package io.raol.advent2022

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

class Day07Tests {
    @Test
    fun samplePart1() {
        val data = Utils.readResourceFile("day7sample")
        val result = Day07(data).part1()
        Assertions.assertThat(result).isEqualTo(95437)
    }

    @Test
    fun solvePart1() {
        val data = Utils.readResourceFile("day7")
        val result = Day07(data).part1()
        Assertions.assertThat(result).isEqualTo(95437)
    }

    @Test
    fun samplePart2() {
        val data = Utils.readResourceFile("day7sample")
        val result = Day07(data).part2()
        Assertions.assertThat(result).isEqualTo(24933642)
    }

    @Test
    fun solvePart2() {
        val data = Utils.readResourceFile("day7")
        val result = Day07(data).part2()
        Assertions.assertThat(result).isEqualTo(95437)
    }
}