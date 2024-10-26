/**
 * 操作符
 */
fun main() {

    var a = 2
    println("${+a}") // 2
    println("${a.unaryPlus()}") // 2
    println("${-a}") // -2
    println("${a.unaryMinus()}") // -2

    var b = true
    println("${!b}") // false
    println("${b.not()}") // false

}