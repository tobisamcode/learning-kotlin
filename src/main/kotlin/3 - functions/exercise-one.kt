fun main(args: Array<String>) {
    doSomething("hello", 3)
    println("function 2 --> ${timesThree(5)}")
    println("function 3 ---> ${maxValue(arrayOf(1,2,3,4,6))}")
}

fun doSomething(msg: String, i: Int): Unit {
    if (i > 0) {
        var x = 0;
        while (x < i) {
            println(msg)
            x += 1
        }
    }
}

fun timesThree(x: Int): Int {
    // x = x * 3 is wrong
    val y = x * 3
    return y
}


fun maxValue(args: Array<Int>): Int {
    var max = args[0]
    var x = 1
    while (x < args.size) {
        var item = args[x]
        max = if (max >= item) max else item
        x += 1
    }

    return max
}