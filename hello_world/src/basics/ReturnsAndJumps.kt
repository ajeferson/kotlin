package basics

fun main(args: Array<String>) {

    val name: String? = "kabuto"
    val notNull = name ?: return // guard let like

    println(notNull)

    // for loop with labels
    outer@ for (i in 0..10) {
        inner@ for(j in 0..5) {
            if(i == 2 && j == 4) break@outer else println("$i $j")
        }
    }

    val numbers = arrayOf(1, 2, 3, 4, 5)
    numbers.forEach lambda@{
        if(it == 3) {
            return@lambda // Lambda return, awesome
        }
    }
    numbers.forEach {
        if(it == 3) {
            return@forEach // Implicit labelling, cool!
        }
    }

}