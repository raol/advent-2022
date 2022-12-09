package io.raol.advent2022

import java.util.Stack
import kotlin.io.path.createTempDirectory

class Day05(private val input : String) {

    fun parse() : Pair<Field, List<Movement>> {
        var parts = input.split("\r\n\r\n")
        return Pair(Field(parts[0]), Movement.movements(parts[1]))
    }

    fun part1() : String {
        val game = parse()
        for (movement in game.second)
            game.first.apply(movement)

        return game.first.getTopCrates()
    }

    fun part2() : String {
        val game = parse()
        for (movement in game.second)
            game.first.apply2(movement)

        return game.first.getTopCrates()
    }

    class Movement(private val movement : String) {
        val from : Int
        val to : Int
        val count : Int

        init {
            var parts = movement.split(" ")
            count = parts[1].toInt()
            from = parts[3].toInt() - 1
            to = parts[5].toInt() - 1
        }

        companion object {
            fun movements(value: String) =
                value.split("\r\n").map(::Movement)
        }
    }


    class Field(private val value : String) {
        var field : List<Stack<Char>> = emptyList()

        init {
            field = parse(value)
        }

        fun apply(movement: Movement) {
            for (m in (0 until movement.count)) {
                val crate = field[movement.from].pop()
                field[movement.to].push(crate)
            }
        }

        fun apply2(movement: Movement) {
            var items = field[movement.from].reversed().take(movement.count).reversed()
            for (i in (0 until movement.count)) {
                field[movement.from].pop()
                field[movement.to].push(items[i])
            }
        }

        fun getTopCrates() =
            field.map { s -> s.peek()}.joinToString("")

        private fun parse(value: String) :  List<Stack<Char>> {
            val lines = value.split("\r\n")
            val digits = lines.last().split(" ").map { l -> l.trim() }.filter { l -> l.isNotEmpty() }
            val crates = (0 until  digits.count()).map<Int, Stack<Char>> { _ -> Stack() }.toList()

            lines.reversed().drop(1)
                .forEach { l -> processLine(l, 0, crates) }

            return crates;
        }

        private fun processLine(line: String, index : Int, state : List<Stack<Char>>) {
            if(line.isEmpty())
                return

            val value = line.take(3)
            if(!value.trim().isEmpty())
                state[index].push(value[1])
            processLine(line.drop(4), index + 1, state)

        }
    }
}