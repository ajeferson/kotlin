package classesAndObjects

private class Outer1 {

    private val bar: Int = 1

    class Nested {
        fun foo() = 2
    }

}

// Anonymous inner classes

private interface Listener {
    fun doSomething()
}

private fun useListener(listener: Listener) {
    listener.doSomething()
}

fun main(args: Array<String>) {

    Outer1.Nested().foo()

}