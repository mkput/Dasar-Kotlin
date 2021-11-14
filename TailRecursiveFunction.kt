tailrec fun display(value: Int){
    println(value)
    if (value > 0){
        display(value - 1)
    }
}

tailrec fun faktorial(value: Int, total: Int = 1): Int{
    return when(value){
        1 -> total
        else -> faktorial(value - 1, total * value)
    }
}


fun main() {
    display(100)
    println(faktorial(10))
}