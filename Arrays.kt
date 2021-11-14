fun main() {
    val name: Array<String> = arrayOf("Khawaril", "putra")
    name.set(0, "M. Khawaril")
    name[1] = "Putra"

    println(name[0])
    println(name[1])

    val nilai: Array<Int?> = arrayOfNulls(5)
    nilai[0] = 12
    nilai[1] = null
    nilai[3] = 22

    println(nilai.size)
    println(nilai[2])


}