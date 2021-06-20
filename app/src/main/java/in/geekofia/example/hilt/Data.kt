package `in`.geekofia.example.hilt

class Data(private val name: String, private val age: Int) {
    val getName get() = name
    val getAge get() = age
}