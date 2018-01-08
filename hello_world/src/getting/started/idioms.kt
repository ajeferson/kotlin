package getting.started

// Extension
fun String.valhalla(): String {
    return "Valhalla!"
}

// Singleton
object Kabuto {
    val name = "kabuto"
}

// Single expressions function
fun single(a: Int, b: Int) = a + b

fun coolSingle(a: Int): Boolean = when (a) {
    10 -> true
    else -> false
}

fun other(b: Int): String = if (b == 10) {
    "yes"
} else {
    "no"
}

fun transform(color: String): Int {
    return when (color.toLowerCase()) {
        "red" -> 1
        "blue" -> 2
        else -> -1
    }
}

class Turtle() {

    fun penDown() {
        println("Pen down!")
    }

    fun draw() {
        println("Draw")
    }

    fun penUp() {
        println("Pen up!")
    }

}

fun main(args: Array<String>) {

    val numbers = listOf(-1, -2, -3, 1, 2, 3, 4, 5)
//    val positives = numbers.filter { n -> n > 0 }
    val positives = numbers.filter { it > 0 }
    println("$numbers")
    println(numbers[0])
    println("The first number is: ${numbers[0]}")
    println("Positives: " + positives)

    val str = "Valhalla!"

    when(str) {
        is String -> println(str.toUpperCase())
    }


    // Ranges
    for(i in 0..5) { print("$i ") } // Closed Range
    println()

    for(i in 0 until 5) { print("$i ") } // Open Range
    println()

    for(i in 0..5 step 2) { print("$i ") }
    println()

    for(i in 5 downTo 0 step 2) { print("$i ") }
    println()

    val closed = 0..5
    val opened = 0 until 5
    val down = 5 downTo 1
    val step = opened step 2

    // Read only list
    val list = listOf(1, 2, 3, 4, 5)
    println(list)

    // Read only map
    val map = mapOf("a" to 1, "b" to 1)
    println(map)
    println(map["a"])

    val a = "a" to 1

    val l: String by lazy {
        println("Computing lazy")
        "Lazy string" // this only gets called once
    }
    println(l)
    println(l)

    var s = "Some string"
    println(s.valhalla())

    val kabuto = Kabuto
    val otherKabuto = Kabuto
    println(kabuto.name)
    println(kabuto == otherKabuto)
    println(kabuto)
    println(otherKabuto)


    val k: String? = null
    val h = k ?: "other"
    println(k?.length ?: "Is empty")
    println(h)

    map["kakaroto"] ?: println("Shenlong")

    val iflet: String? = "iflet"
    iflet.let {
        println(iflet)
    }

    val color: String? = "red"
    val t = color?.let { transform(it) } ?: 0


    // Try catch
    val result = try {
        4 // Something that can possibly throw an exception
    } catch (e: Exception) {
        e.printStackTrace()
    }
    println(result)

    // If expression
    val param = 1
    val exp = if (param == 1) {
        10
    } else if (param == 2) {
        20
    } else {
        30
    }

    val sum = single(10, 20)
    println(sum)

    val turtle = Turtle()
    with(turtle) {

        println("Will pen down")
        penDown()

        println("Will draw")
        draw()

        println("Will Pen up")
        penUp()

    }

    // Consuming nullable boolean
    val b: Boolean? = null
    if(b == true) {
    } else {

    }


}