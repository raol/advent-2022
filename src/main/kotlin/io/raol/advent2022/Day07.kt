package io.raol.advent2022

import java.util.Stack

class Day07(private val input : String) {
    fun part1() : Int {
        val fs = buildFs()
        return fs.directories.filter { s -> s.size <= 100000 }.sumOf { s -> s.size }
    }

    fun part2() : Int {
        val fs = buildFs()
        return fs.directories
            .filter { d -> 70000000 - fs.directories.first().size + d.size >= 30000000 }
            .minOf { d -> d.size }
    }

    private fun buildFs() : FileSystem {
        var entries = parse()
        var fs = FileSystem()
        for(e in entries)
            fs.apply(e)

        return fs
    }

    private fun parse() =
        input.split(Utils.linebreak()).map(::parseCommand);

    private class FileSystem {

        val directories = mutableListOf<Directory>()
        private val state : Stack<Directory> = Stack<Directory>()

        fun apply(command : Entry) {
            when(command) {
                is Entry.Cd -> {
                    when(command.path) {
                        ".." -> state.pop()
                        else -> {
                            val dir = Directory("${currentName()}${command.path}/")
                            state.push(dir)
                            directories.add(dir)
                        }
                    }

                }
                is Entry.File -> { addFile(command.size) }
                is Entry.NoOp -> {}
            }
        }

        fun currentName() : String {
            if (state.any())
                return state.peek().path
            return ""
        }

        fun addFile(size : Int) {
            for(s in state.elements()) {
                s.addFile(size)
            }
        }
    }

    private fun parseCommand(line : String) : Entry {
        if(line.startsWith("$ cd "))
            return Entry.Cd(line.replace("$ cd ", ""))
        if(line.startsWith("dir "))
            return Entry.NoOp()
        if(line == "$ ls")
            return Entry.NoOp()

        return Entry.File(line.split(" ").first().toInt())
    }

    class Directory(val path : String) {
        var size = 0
        fun addFile(s : Int) {
            size += s
        }
    }

    sealed class Entry {
        class File(val size : Int) : Entry()
        class Cd(val path : String) : Entry()
        class NoOp() : Entry()
    }
}
