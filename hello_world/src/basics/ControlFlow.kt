package basics

fun main(args: Array<String>) {

    val a = 10
    val b = 11
    val max = if (a > b) a else b // If as an expression
    val otherMax = if (a > b) { // If as a statement
        println("Can have other things also")
        a // Ifs return things
    } else b


    // When
    val x = 10
    val y = when(x) {
        1 -> { println("Is 1"); 1 }
        10 -> { println("Is 10"); 10 }
        else -> {
            println("Is something else")
            println("The { and } are not mandatory")
            -1
        }
    }

    val z = when(x) {
        1 -> 1
        else -> -1
    }

    when(x) {
        0, 1 -> println("Ronaldo0")
        else -> println("Not Ronaldo")
    }

    when(x) {
        in 1..10 step 2 -> println("In range")
        !in 1..10 step 2 -> println("Not in range")
    }

    // Smart cast
    val q: Any = "something"
    when(q) {
        is Int -> println(q.toLong())
        is String -> {
            println("Is a string")
            print(q.toUpperCase())
        }
    }

    // When with boolean expressions
    val coolNumber = CoolNumber(10)
    when {
        coolNumber.isOdd() -> println("Is odd")
        else -> println("Is even")
    }

    val arr = arrayOf(1, 2, 3, 4, 5)
    val list = listOf(1, 2, 3, 4, 5)
    for (i in arr) {
        print("$i ")
    }
    for (i in arr.indices) {
        print("${arr[i]} ")
    }
    val indices = list.indices step 2

    var inc = 5
    while(inc > 0) {
        inc--
    }

    inc = 5
    while (inc > 0) inc--

    inc = 5
    do {
        println("Inc")
    } while (inc-- > 0)

}

private class CoolNumber(val number: Int) {

    fun isOdd(): Boolean {
        return number % 2 != 0
    }

    fun isEven(): Boolean {
        return !isOdd()
    }

}