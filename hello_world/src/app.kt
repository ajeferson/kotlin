import com.sun.org.apache.xpath.internal.operations.Bool

fun sum(a: Int, b: Int): Int {
    return a + b
}

fun sumWithExpressionBody(a: Int, b: Int) = a + b

fun shouldHaveFun(day: String) = if(day.toLowerCase() == "friday") println("Yeah!") else println("Nope! =(")

// What is Unit? (Void)

fun printSum(a: Int, b: Int) = println("Sum of $a and $b is ${a + b}")

fun branchCast(a: Any) {
    if(a is String) {
        println("Here a is string: ${a.toUpperCase()}")
        println("This is really awesome =)")
    }
    println("Here is not a string")
}

fun lengthOfAny(a: Any): Int? {
    if(a is String && a.length > 0) {
        return a.length
    }
    return null
}

fun main(args: Array<String>) {
    println("Hello, World!")
    println(sum(1, 2))
    println(sumWithExpressionBody(4, 6))
    printSum(5, 9)

    val x: Int = 10 // Constant
    val y = 10
    val z: Int
    z = 10

    var v: Int = 1
    fun incV() = v++
    incV()
    incV()
    incV()
    println("v=$v")

    // Template
    println("V using template: ${v}")

    var optional: Int? // Nice <3

    println("Should I have fun?")
    shouldHaveFun("wednesday")

    branchCast("Kakaroto")

    lengthOfAny("Ronaldo")


    val list = listOf(10, 20, 30)
    println("Foreach:")
    for (number in list) {
        print("$number ")
    }
    println()


    val ranges = list.indices
    println("For ranges")
    for (i in ranges) {
        print("$i ")
    }
    println()

    var j = 0
    while(j < list.size) {
        println(list[j])
        j++
    }

    fun describe(obj: Any) {
        when(obj) {
            is Int -> println("is Int")
            is String -> println("${obj.toUpperCase()}")
            else -> println("Something else")
        }
    }

    describe("something")

    fun checkInRange(a: Int): Boolean {
        return a in 0..9
    }

    println(checkInRange(10))

//    for(i in 1..10 step 2) {
//        println(i)
//    }

    val progA = 1..10 step 2
    val progB = 10 downTo 1 step 3
    val progC = 1 until 10 step 1

    println("ProgC")
    for(i in progC) println(i)

    // cool switch
    val fruit = "letter"
    val other = "other"
    when {
        fruit == "strawberry" -> println("Is a strawberry")
        fruit in listOf("letter", "plane") -> println("It is not a fruit =(")
        other == "other" -> println("Other")
    }


}