package io.raol.advent2022
import org.assertj.core.api.Assertions.assertThat
import io.raol.advent2022.Utils.readResourceFile
import org.junit.jupiter.api.Test

class Day01Tests {

    @Test
    fun samplePart1() {
        var data = readResourceFile("day1sample")
        var result = Day01(data).part1()
        assertThat(result).isEqualTo(24000)
    }

    @Test
    fun samplePart2() {
        var data = readResourceFile("day1sample")
        var result = Day01(data).part2()
        assertThat(result).isEqualTo(45000)
    }

    @Test
    fun solvePart1() {
        var data = readResourceFile("day1")
        var result = Day01(data).part1()
        assertThat(result).isEqualTo(72070)
    }

    @Test
    fun solvePart2() {
        var data = readResourceFile("day1")
        var result = Day01(data).part2()
        assertThat(result).isEqualTo(211805)
    }

}