fun main() {
    var firstName: String = "Khawaril"
    var lastName = "Putra"
    val fullName = "$firstName $lastName"
    val desc: String = "$fullName length = ${fullName.length}"

    println(fullName)
    println(desc)

    firstName = "Monkey D."
    lastName = "Luffy"
    println(firstName + " " + lastName)

}