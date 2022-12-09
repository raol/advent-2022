package io.raol.advent2022

class Day03(private val input: String) {

    private val chars = ('a' .. 'z') + ('A' .. 'Z')

    fun part1() =
        solve(parse1())

    fun part2() =
        solve(parse2())

    private fun solve(values : List<List<Set<Char>>>) =
        values.map { v -> v.reduce { acc, value -> acc.intersect(value) } }
            .map(::getLineScore)
            .sum()

    private fun parse2() =
        input.split("\r\n")
            .mapIndexed { i, s -> Pair(i / 3, s) }
            .groupBy({ p -> p.first}, {p -> p.second.toSet()})
            .map { group -> group.value }

    private fun parse1() =
        input.split("\r\n")
            .map { line -> listOf(line.take(line.length / 2).toSet(), line.drop(line.length / 2).toSet()) }


    private fun getLineScore(value : Iterable<Char>) = value.map(::charValue).sum()

    private fun charValue(char : Char) = chars.indexOf(char) + 1

}