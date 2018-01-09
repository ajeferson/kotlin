package classesAndObjects

interface MyInterface {

    var a: String

    var propertyWithImplementation: String
        get() = "haha"
        set(value) {
            a = value
        }

    fun foo()

    fun bar() {
        println("Default implementation")
    }

    fun printA() {
        println("a = $a")
    }

}

interface K {

    fun foo() {}

    fun bar()

    fun other() {}

}

interface L {

    fun foo() {}

    fun bar() {}

}

class M: K, L {

    // As both K and L have implementations for foo, M must implement foo
    override fun foo() {
        super<K>.foo()
        super<L>.foo()
    }

    override fun bar() {
        super.bar()
    }

}

class Child(override var a: String): MyInterface {

    override fun foo() {
        println("Fooing")
    }

}

fun main(args: Array<String>) {

    val c = Child("Kakaroto")
    c.printA()

}