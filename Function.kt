//function, parameter, default parameter, named argument
fun sayHello(firstName: String, lastName: String = ""){
    println("$firstName $lastName")
}

//return value function
fun sum(a: Int, b: Int): Int{
    val total = a + b
    return total
}

//single expression function
fun kaliDua(a: Int): Int = a * 2

//varargs parameter function, parameter terakhir boleh dimasukkan data lebih dari satu
fun hitungTotal(vararg values: Int): Int{
    var total = 0

    for (value in values){
        total += value
    }

    return  total
}

fun main() {
    sayHello("Khawaril")
    sayHello("Khawaril", "Putra")
    sayHello(lastName = "Putra", firstName = "Khawaril")

    val tambah = sum(5, 4)
    println(tambah)

    println(kaliDua(10))

    println(hitungTotal(21, 10, 50))
}