package classesAndObjects

/**
 * If you do not specify any visibility modifier, public is used by default, which means that your declarations will be visible everywhere;
 * If you mark a declaration private, it will only be visible inside the file containing the declaration;
 * If you mark it internal, it is visible everywhere in the same module;
 * protected is not available for top-level declarations.
 * */

private fun fooo() {} // Visible only in this file

public var bar: Int = 5 // Visible everywhere
    private set // visible only in this file

internal var baz: Int = 10 // visible in the same module



open class Outer {

    private val a = 1
    protected open val b = 2
    internal val c = 3
    val d = 4

//    private open val v = 10 // Makes no sense to be open and private

    private class Nested(val some: String) {
    }

    fun method() {
    }

}

fun main(args: Array<String>) {


//    val p = P()

}