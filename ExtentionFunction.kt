fun String.hello(): String = "hello $this"

fun String.printHello(): Unit = println(hello())

fun main() {

    val name = "Aril"

    println(name.hello())
    name.printHello()

    "Khawaril".printHello()

}