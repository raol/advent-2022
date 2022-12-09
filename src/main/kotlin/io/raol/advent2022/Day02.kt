package io.raol.advent2022

class Day02(private val input: String) {
    fun part1() : Int = parse().map(::solveRound).sum()
    fun part2() : Int = parse().map(::solveRoundStrategy).sum()

    private fun parse() =
        input.split("\r\n").map(::parseLine)

    private fun parseLine(line: String) : Pair<Theirs, Yours> {
        var parts = line.split(" ")
        return Pair(Theirs.valueOf(parts[0]), Yours.valueOf(parts[1]))
    }

    private fun solveRound(round : Pair<Theirs, Yours>) : Int {
        var roundValue = when(round) {
            Pair(Theirs.A, Yours.X) -> 3
            Pair(Theirs.A, Yours.Y) -> 6
            Pair(Theirs.A, Yours.Z) -> 0
            Pair(Theirs.B, Yours.X) -> 0
            Pair(Theirs.B, Yours.Y) -> 3
            Pair(Theirs.B, Yours.Z) -> 6
            Pair(Theirs.C, Yours.X) -> 6
            Pair(Theirs.C, Yours.Y) -> 0
            Pair(Theirs.C, Yours.Z) -> 3
            else -> 0
        }

        return roundValue + round.second.value
    }

    private fun solveRoundStrategy(round : Pair<Theirs, Yours>) : Int {
        var roundValue = when(round) {
            Pair(Theirs.A, Yours.X) -> 0 + 3
            Pair(Theirs.A, Yours.Y) -> 3 + 1
            Pair(Theirs.A, Yours.Z) -> 6 + 2
            Pair(Theirs.B, Yours.X) -> 0 + 1
            Pair(Theirs.B, Yours.Y) -> 3 + 2
            Pair(Theirs.B, Yours.Z) -> 6 + 3
            Pair(Theirs.C, Yours.X) -> 0 + 2
            Pair(Theirs.C, Yours.Y) -> 3 + 3
            Pair(Theirs.C, Yours.Z) -> 6 + 1
            else -> 0
        }

        return roundValue;
    }

    private enum class Theirs(var value : Int) {
        A(1),
        B(2),
        C(3)
    }

    private enum class Yours(val value : Int) {
        X(1),
        Y(2),
        Z(3)
    }

}