fun main() {
    val array: Array<String> = arrayOf("M.", "Khawaril", "Putra")
    for (name in array){
        println(name)
    }

    val ukuranArray = array.size -1
    for (i in 0..ukuranArray){
        println("Index ke-$i = ${array[i]}")
    }
}