fun main() {
    val x = 2
    when (x) {
        0 -> println("x is zero")
        1, 2 -> print("x is 1 or 2")
        else -> {
            println("x is not 0,1 or 2")
            println("x is some other value")
        }
    }
}
