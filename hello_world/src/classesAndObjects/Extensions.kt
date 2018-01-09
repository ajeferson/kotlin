package classesAndObjects

fun <T> MutableList<T>.swap(index1: Int, index2: Int) {
    val tmp = this[index1]
    this[index1] = this[index2]
    this[index2] = tmp
}

open class CC

class DD: CC()

fun CC.foo() = "c"
fun DD.foo() = "d"

fun printFoo(c: CC) {
    println(c.foo())
}

// Nullable receiver

fun Any?.shenlong() {
    println("Shenlong")
}

fun Any.shenlong(i: Int) {
    println("Shenlong with int")
}

// Extension Propeties
val Int.kakaroto: Int get() = 10

class N {

    fun bar() {
        println("Bar from N")
    }

}

class O {

    fun baz() {
        println("Baz from O")
    }

    fun N.foo() {
        bar() // from N | same as this.bar()
        baz() // from O | same as this@O.baz()
        this@O.baz()
        this.bar()
    }

}

open class Z {}

class Z1: Z() {

}

open class X {

    open fun Z.foo() {
        println("Z.foo in X")
    }

    open fun Z1.foo() {
        println("Z1.foo in X")
    }

    fun caller(z: Z) {
        z.foo()
    }

}

open class X1: X() {

    override fun Z.foo() {
        println("Z.foo in X1")
    }

    override fun Z1.foo() {
        println("Z1.foo in X1")
    }

}

fun main(args: Array<String>) {

    val list = mutableListOf(1, 2, 3, 4, 5)
    println(list)
    list.swap(0, 1)
    println(list)

    printFoo(CC())
    printFoo(DD())

    val k: Int? = 1
    k.shenlong()
    k?.shenlong(1)
    println(k?.kakaroto)


    X().caller(Z())
    X1().caller(Z())
    X().caller(Z1())
}