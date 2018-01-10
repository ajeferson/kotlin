package classesAndObjects

// TO Like

fun funWithDefaultParams(param: String = "default value") = param

data class User(var name: String, var age: Int)

fun main(args: Array<String>) {

    val user = User("Alan", 23)
    val c = user.copy()

    println(user)
    println("Identity: ${user === c}")
    println("Equality: ${user == c}")
    c.name = "Jeferson"
    println("Equality: ${user == c}")
    println(user.component1())
    println(user.component2())

    println(funWithDefaultParams())

    // Destructuring, this is really awesome
    val (name, age) = user
    println("After destructuring: $name and $age")


}