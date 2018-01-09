package classesAndObjects

open class Animal(val name: String?) {

    init {
        println("This is a init block")
    }

    var age: Int? = null
    var nickname: String? = null

    val description: String get() {
        if(name != null && nickname != null) {
            return "$name, $nickname"
        }
        if(name != null) {
            return name
        }
        return nickname!!
    }

    constructor(): this(null) {
    }

    constructor(name: String, age: Int): this(name) {
        this.age = age
    }

    constructor(name: String, nickname: String, age: Int): this(name) {
        this.age = age
        this.nickname = nickname
    }

    open fun eat() {
        println("Eating...")
    }

}

interface Walking {
    fun walk()
}

class Dog(name: String, val kind: String): Animal(name), Walking {

    override fun walk() {
        println("Dog is walking...")
    }

    override fun eat() {
        println("Dog is eating...")
    }

}

fun smartCast(a: Any?) {

    if(a is Int) {
        println("Is an Int")
        println(a.toLong())
    } else if(a is String) {
        println("Is a String")
        println(a.toUpperCase())
    }

    when(a) {
        is Double -> println("Is a Double")
        else -> println("Is something else")
    }

}

fun main(args: Array<String>) {

    val param = 10
    var x = if(param <= 10) {
        10
    } else {
        11
    }

    x = when(x) {
        10 -> 10
        is Int -> 5
        else -> 30
    }

    with(x) {
        val y = when(toLong()) {
            10L, 5L -> 10
            in 11L..20L -> {
                println("Something")
                100
            }
            else -> 20
        }
    }

    println(x)
    println("$x")
    println("${x}")
    println("" + x)

    smartCast(10)
    smartCast("String")
    smartCast(10.3)
    smartCast(true)

    val dog = Dog("Luffy", "Labrador")

}