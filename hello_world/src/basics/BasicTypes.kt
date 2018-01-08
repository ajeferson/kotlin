package basics

// Testing import
import basics.customPackage.SomeClass as Bode
import basics.customPackage.someVar as some
//import basics.customPackage.thisIsPrivate
import basics.customPackage.SomethingElse as Something


fun main(args: Array<String>) {

    val decimal = 10
    val long = 10L
    val hexa = 0xa
    val bin = 0b0011

    val double = 10.2
    val exp = 5e1
    val float = 10.2f

    println(bin)
    println(exp)

    val oneMillion = 1_000_000
    val bytes = 0b1100_0011


    // === identity (memory address)
    // == equality

    // Boxes
    val a: Int = 10
    println(a == a)

    val boxed: Int? = a
    val anotherBoxed: Int? = a
    println(boxed === anotherBoxed)


    val small: Int? = 1
    val big: Long? = small?.toLong()

    /**
     * Bitwise operations
     * shl(bits) – signed shift left (Java's <<)
     * shr(bits) – signed shift right (Java's >>)
     * ushr(bits) – unsigned shift right (Java's >>>)
     * and(bits) – bitwise and
     * or(bits) – bitwise or
     * xor(bits) – bitwise xor
     * inv() – bitwise inversion
     * */


    val n = 10
    val char: Char = 'c'


    // Arrays
    val arr1 = arrayOf(1, 2, 3)
    val arr2 = arrayOfNulls<Int>(3)
    val arr3 = intArrayOf(1, 2, 3)
    val list = listOf(1, 2, 3)
    println(arr1[0])
    println(list[0])
    println(arr3[0])
    arr2[1] = 2


    //Strings
    val some = "Some string"
    for(s in some) { println(s) }

    val escaped = "Escaped"
    val raw = """
        |This is
        |a
        |raw string
        """.trimMargin()
    println(escaped)
    println(raw)

    val bode = Bode("Kakaroto")
    println(bode.name)
    println(some)

}