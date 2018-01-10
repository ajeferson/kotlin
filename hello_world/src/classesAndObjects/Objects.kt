package classesAndObjects

/**
 * Objects are heavily influenced by visibility modifiers
 * */

private open class Listen(x: Int) {
    public open val y: Int = x
}

private interface Listen2

// Object expressions are private
class V {

    private fun foo() = object {
        val x: String = "x"
    }

    fun publicFoo() = object {

        val x: String = "x"

    }

    fun bar() {
        val x1 = foo().x
        val x2 = publicFoo()
    }

}

private interface Evaluatable {
    fun evaluate(d: Double)
}

private fun evaluateWith(evaluatable: Evaluatable, d: Double) {
    evaluatable.evaluate(d)
}

// Singleton (object declaration)
private object Singleton {

    var a = 1

    fun incA() {
        a++
    }

}

private fun kakaroto(singleton: Singleton) {
    singleton.incA()
}

interface Picolo {

    fun foo() {
        println("Fooing around")
    }

}

class Vegeta {

    private val trivialObject = object: Picolo {

        val x = 10 // this can only be accessed from local and private scope, not public
        private var n = 20
    }

    // y can not be seen outside of picoloObject because  picoloObject is public, the type is only Picolo
    val picoloObject = object: Picolo {
        val y = 20
    }



    fun foo() {
        trivialObject.x// Does not work because foo() is public
    }

}

fun main(args: Array<String>) {

    val ab: Listen = object: Listen(1), Listen2 {

        override val y: Int = super.y + 1
    }

    // Javascript like (object expression)
    var js = object {

        var x: Int = 10
        var y: Int = 20

        fun foo() {
            println("Fooing from general object")
        }
    }

    // Capturing stuff with objects (object expression)
    evaluateWith(object: Evaluatable {

        var initial = 1.3

        override fun evaluate(d: Double) {
            println("Evaluating with $d")
            initial += d
        }
    }, 1.0)

    val otherEvaluatable = object: Evaluatable {

        var initial = 1.3

        override fun evaluate(d: Double) {
            println("Evaluating with $d")
            initial += d
        }
    }
    evaluateWith(otherEvaluatable, 2.0)

    println(Singleton.a)
    Singleton.incA()
    println(Singleton.a)

}