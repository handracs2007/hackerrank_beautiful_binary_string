// https://www.hackerrank.com/challenges/beautiful-binary-string/problem

fun beautifulBinaryString(b: String): Int {
    var swapCount = 0
    var str = b

    while (str.contains("010")) {
        val loc = str.indexOf("010")
        str = str.replaceRange(loc + 2, loc + 3, "1")
        swapCount++
    }

    return swapCount
}

fun main() {
    println(beautifulBinaryString("0101010"))
    println(beautifulBinaryString("01100"))
    println(beautifulBinaryString("0100101010"))
}