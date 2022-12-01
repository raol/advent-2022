package io.raol.advent2022

class Day01(private val input: String) {

    fun part1() = parse().maxOfOrNull { v -> v.sum() }

    fun part2() = parse().map { v -> v.sum() }.sortedDescending().take(3).sum()

    private fun parse() : List<IntArray> =
        input.split("\n\n")
            .map { s -> s.split("\n").map { ss -> ss.toInt() }.toIntArray() }
}