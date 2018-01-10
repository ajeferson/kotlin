package classesAndObjects

fun String.coolUppercase(): String {
    return "cool ${toUpperCase()}"
}

open class Q {


}

class W: Q()

fun Q.foo() {
    println("Foo from Q")
}

fun W.foo() {
    println("Foo from W") // this will lose because member always win
}

// Nullable receiver
private val Any?.isNull: Boolean
    get() = this == null

fun Any?.kakaroto() {
    println("kakaroto!")
}

private fun String.valhalla() {
    println("Outise valhalla")
}

private class Valhalla {

    fun String.valhalla() {
        println("inside valhalla")
    }

    fun callValhalla() {
        "".valhalla();
    }

}

fun main(args: Array<String>) {

    val str = "ronaldo"
    println(str.coolUppercase())

    Q().foo()
    W().foo()

    val i: Int? = null
    var s = ""
    println(i.isNull)
    println(i?.isNull)
    println(s.isNull)
    i?.kakaroto()

    "".valhalla()
    Valhalla().callValhalla()

}