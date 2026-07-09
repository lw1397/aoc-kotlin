import aoc_2024.aoc2024Entry
import java.io.File

fun main() {
    aoc2024Entry()
}

fun getFileAsStringLines(input: String): List<String> =
    File(input).let {
        if (it.exists()) it.readText().trim().split("\r\n+".toRegex()) else throw Exception("File does not exists: $input")
    }

fun getFileAsString(input: String): String =
    File(input).let {
        if (it.exists()) it.readText().trim() else throw Exception("File does not exists: $input")
    }

fun fileName(problem: Int, year: Int = 2024, test: Boolean = false) =
    "C:/Users/Skitt/Documents/GitHub/aoc-kotlin/src/main/kotlin/aoc_$year/aoc${problem}_${year%2000}/${if (test) "test" else "input"}.txt"