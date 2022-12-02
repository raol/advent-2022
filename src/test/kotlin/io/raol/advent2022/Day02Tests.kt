package io.raol.advent2022

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

class Day02Tests {
    @Test
    fun samplePart1() {
        var data = Utils.readResourceFile("day2sample")
        var result = Day02(data).part1()
        Assertions.assertThat(result).isEqualTo(15)
    }

    @Test
    fun samplePart2() {
        var data = Utils.readResourceFile("day2sample")
        var result = Day02(data).part2()
        Assertions.assertThat(result).isEqualTo(12)
    }

    @Test
    fun solvePart1() {
        var data = Utils.readResourceFile("day2")
        var result = Day02(data).part1()
        Assertions.assertThat(result).isEqualTo(13268)
    }

    @Test
    fun solvePart2() {
        var data = Utils.readResourceFile("day2")
        var result = Day02(data).part2()
        Assertions.assertThat(result).isEqualTo(15508)
    }
}