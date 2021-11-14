fun main() {
    val range = 1..100 step 2
    val down = 100 downTo 1 step 2

    println(range.count())
    println(range.contains(50))
    println(range.contains(200))
    println(range.first)
    println(range.last)
    println(range.step)

    println(down.count())
    println(down.contains(50))
    println(down.contains(200))
    println(down.first)
    println(down.last)
    println(down.step)
}