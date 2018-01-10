package classesAndObjects

/**
 * Generics type in Java are invariant
 * List<String> is not a subtype of List<Object>
 *
 * */

class Box<T>(t: T) {

    val value: T = t

}

interface Source<out T> {
    fun next(): T
}

fun receiveSource(source: Source<String>) {
    val s: Source<Any> = source
}

interface Comparable<in T> {
    fun compareTo(other: T)
}

fun demo(comparable: Comparable<Number>) {
    val y: Comparable<Double> = comparable
}

val b = Box(1) // or val b = Box<Int>(1)
fun main(args: Array<String>) {



}