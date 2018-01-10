package classesAndObjects

enum class Direction(val description: String) {

    NORTH("north") {
        override fun valhalla() {
            println("Valhalling from north")
        }
    },

    SOUTH("south") {
        override fun valhalla() {
            println("Valhalling from south")
        }
    };

    abstract fun valhalla()

    override fun toString(): String {
        return "Overrides ${super.toString()}"
    }

}

private interface Inter {
    fun foo()
}

fun main(args: Array<String>) {


    val south = Direction.SOUTH
    println("Name: ${south.name}, Ordinal: ${south.ordinal}")

    val s = Direction.valueOf("SOUTH")
    val values = Direction.values()
//    println(s)
    values.forEach { println(it) }

    println(enumValues<Direction>())

}
