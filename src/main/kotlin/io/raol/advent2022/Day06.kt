package io.raol.advent2022

class Day06(private val input : String) {
    fun part1() = getFirstPosition(input, 0, 4)
    fun part2() = getFirstPosition(input, 0, 14)

    private fun getFirstPosition(value : String, position : Int, length : Int) : Int {
        if (value.isEmpty())
            return -1

        if(value.take(length).toSet().count() == length)
            return position + length;

        return getFirstPosition(value.drop(1), position + 1, length)
    }
}