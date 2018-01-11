package classesAndObjects

/**
 * Object expressions => Weird private  unique stuff
 * Object declarations => Singleton (can not be used on the right side of an assignment)
 * */

open class Gohan {

    val g = 10

}

// If it is not private, the members are invisible
private val ab = object: Gohan() {
    val x = 10
    val y = 10
}

val invisibleMembers = object: Gohan() {

    // Only .g is visible because extends Gohan
    val x = 20 // this is invible outside this object

}

private class Fifteen {

    // As it is private, the return is anonymous object
    private fun foo() = object {
        val x = 10

        fun thisCanAlsoHaveMethods(): Int {
            return 1
        }

    }

    // As it is public, the return is any
    fun publicFoo() = object {
        val x = 10
    }

    fun bar() {
        foo().x
//        publicFoo().x // Does not work
    }

}

private class SixTeen {

    // The return type is anonymous object type
    private fun foo() = object: Gohan() {
        val x = 10
    }

    // The return type is Gohan, as this is public
    fun publicFoo() = object: Gohan() {
        val x = 10
    }

    fun bar() {
        foo().g
        foo().x
        publicFoo().g
//        publicFoo().x // Does not public
    }

}

object NiceSingleton: Gohan() {

    val j get() = 10

    fun doNiceSingletonStuff() {

    }

}

class MyCoolClass {

    var c = object: Gohan() {

    }

    // The name Kabuto is optional
    companion object Kabuto: Gohan() {

        fun staticMethod() {

        }

    }

}

interface Factory<out T> {
    fun produce(): T
}


class Impl {

    // This is really confusing, but companion objects are not actually static
    // This kind of make the
    companion object Bode: Factory<Int> {

        @JvmStatic // Makes really static
        override fun produce(): Int {
            return 1
        }

    }

}
/**
 * Objects are "unique" in the sense, that are no classes for them
 * that's why their members are not visible if it is public
 * because others outside the file can not predict what are the members
 * only files inside the same file (or class) can do that, because they can
 * fucking READ the code, as they are written together
 * */

fun khfds() {
    println(ab.x)
    println(ab.g)
    println(invisibleMembers.g)
    MyCoolClass().c.g // through c
    MyCoolClass.g // companion object
    MyCoolClass.staticMethod() // Kinda like static, but not actually
    Impl.produce()
}