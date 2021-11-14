const val APP = "Variable di kotlin"

fun main(){
    val name = "Your name"
    var greeting: String? = null

    greeting = "Hello"
    val desc = greeting?.length

    println(APP)
    println(name)
    println(desc)
}