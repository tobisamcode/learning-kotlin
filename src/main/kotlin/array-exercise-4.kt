fun main(args: Array<String>) {
    val x: Array<Int> = arrayOf(0, 1, 2 , 3, 4)
    x[3] = x[2]
    x[4] = x[0]
    x[2] = x[1]
    x[1] = x[0]
    x[0] = x[1]
    x[4] = x[3]
    x[3] = x[2]
    x[2] = x[4]

    var y = 0
    while (y < 5){
        println("x[${y}] ----> ${x[y]}")
        y += 1
    }
}