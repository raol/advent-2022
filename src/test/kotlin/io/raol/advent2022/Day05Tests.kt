package io.raol.advent2022

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test
import java.util.Stack

class Day05Tests {

    @Test
    fun samplePart1() {
        val data = Utils.readResourceFile("day5sample")
        val result = Day05(data).part1()
        Assertions.assertThat(result).isEqualTo("CMZ")
    }

    @Test
    fun solvePart1() {
        val data = Utils.readResourceFile("day5")
        val result = Day05(data).part1()
        Assertions.assertThat(result).isEqualTo("LBLVVTVLP")
    }

    @Test
    fun samplePart2() {
        val data = Utils.readResourceFile("day5sample")
        val result = Day05(data).part2()
        Assertions.assertThat(result).isEqualTo("MCD")
    }

    @Test
    fun solvePart2() {
        val data = Utils.readResourceFile("day5")
        val result = Day05(data).part2()
        Assertions.assertThat(result).isEqualTo("TPFFBDRJD")
    }
}