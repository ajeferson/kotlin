package classesAndObjects

// Declaration = class name + class header + class body

class Invoice {

}

class Empty {

}

class Person(firstName: String) {

    init {
        println("First initialization block")
    }

    val firstName = firstName

    init {
        println("Second initialization block $firstName")
    }

}

class Leute(val name: String) {

    var age: Int? = null

    init {
        println("1st block")
    }

    init {
        println("2nd block")
    }

    constructor(name: String, age: Int): this(name) {
        this.age = age
    }

}

// can be used to implement singletons
class DontCreateMe private constructor() {

}

open class Base(val value: Int) {

    fun canNotOverride() {
        println("can not override from base")
    }

    open fun canOverride() {
        println("Can override from base")
    }

}

class Derived(value: Int): Base(value) {

    override fun canOverride() {
        println("Can override from derived")
    }

}

class SomeClass constructor() {

    constructor(s: Int): this() {
    }

}


class Context

open class UIView constructor() {

    var context: Context? = null

    constructor(context: Context): this() {
        this.context = context
    }

}

class UILabel(context: Context): UIView(context) {
}

open class Foo {

    private var y = 10

    open val x: Int get() {
        return if(y == 10) 10 else 20
    }

    open val lazyVar: Int by lazy {
        1
    }

    open fun fooing(){
        println("Fooing")
    }

}

open class Bar: Foo() {

    override val x: Int = 10

    final override val lazyVar = 20

    final override fun fooing() {
        println("Barring")
    }

}

class Bar2: Bar() {

    // Can not override fooing method

}

interface Cool {
    var a: Int get set
}

class Awesome(override var a: Int): Cool {}

class Amazing: Cool {
    override var a = 10
}


open class Kakaroto {

    private var _a = 0

    open var a: Int get() {
        println("Getting A")
        return _a
    } set(value) {
        println("Setting A to $value")
        _a = value
    }

}

interface CoolInterface {

    fun coolFunction() {
        println("This is implemented by default")
    }

}

class CoolClass: CoolInterface {



}

open class A {

    open fun f() {
        println("F from A")
    }

    open fun g() {
        println("G from A")
    }

}

interface B {

    fun f() {
        println("F from B")
    }

    fun i() {
        println("I from B")
    }

}

class C: A(), B {

    override fun f() {
        super<A>.f()
        super<B>.f()
        println("F from C")
    }

}

fun main(args: Array<String>) {

    val ronaldo = Person("ronaldo")
    val leute = Leute("Leute", 10)
    var someClass = SomeClass()
    someClass = SomeClass(10)

    val base = Base(10)
    val derived = Derived(10)
    base.canNotOverride()
    derived.canNotOverride()
    base.canOverride()
    derived.canOverride()


    val kakaroto = Kakaroto()
    kakaroto.a = 20
    println(kakaroto.a)

    val cool = CoolClass()
    cool.coolFunction()

    val c = C()
    c.f()

}