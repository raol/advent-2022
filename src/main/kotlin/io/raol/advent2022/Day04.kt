package io.raol.advent2022

class Day04(private val input : String) {

    fun part1() =
        parse().count { p -> p.first.containsAll(p.second) || p.second.containsAll(p.first) }

    fun part2() =
        parse().count { p -> p.first.intersect(p.second).isNotEmpty() }

    private fun parse() : List<Pair<Set<Int>, Set<Int>>> =
        input.split("\n")
            .map(::lineToPair)

    private fun lineToPair(line : String) : Pair<Set<Int>, Set<Int>> {
        val parts = line.split(",")
        return Pair(stringToSet(parts[0]), stringToSet(parts[1]))
    }

    private fun stringToSet(value : String) : Set<Int> {
        val parts = value.split("-")

        return (parts[0].toInt()..parts[1].toInt()).toSet()
    }
}