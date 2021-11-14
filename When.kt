fun main() {
    val nilai = "E"

    when(nilai){
        "A", "B", "C" -> {
            println("Anda Lulus")
        }
        else -> {
            println("Anda tidak Lulus")
        }
    }

    val finalExam = "A"
    val passValues: Array<String> = arrayOf("A", "B", "C")

    when(finalExam){
        in passValues -> {
            println("Selamat Anda Lulus")
        }
        else -> {
            println("Maaf Anda tidak Lulus")
        }
    }

    val name = "Aril"
    when(name){
        is String -> println("name is String")
        !is String -> println("name is not String")
    }



}