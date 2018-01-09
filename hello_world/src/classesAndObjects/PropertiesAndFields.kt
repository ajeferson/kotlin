package classesAndObjects

// Compiler time constant
const val SOME_CONSTANT: String = "some constant" // Macro-like
@Deprecated(SOME_CONSTANT) fun foo() {}

class Mirror {

    var size = 0

    // Must be non-null non-primitive typed
    lateinit var shen: String

    val isEmpty: Boolean
        get() {
            return size == 0
        }

    val empty get() = size == 0

    var setterVisibility = "abc"
        private set

    // Backing field
    var f = "abc"
        set(value) {
            field = "f = $value" // Sets the raw field instead of the property
        }

    // Backing property
    var _backingProperty: String? = null
    val backingProperty: String
        get() = _backingProperty ?: ""


    fun method() {
    }

}

fun main(args: Array<String>) {

    val m = Mirror()
    println(m.f)
//    m.f = "Bode"
    with(m) {
        f = "Valhalla!"
    }
    println(m.f)
    println(m.shen)

}