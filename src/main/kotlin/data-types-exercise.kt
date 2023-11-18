// Give the necessary types to the following lines of code
fun main(args: Array<String>) {
    var x: Int = 65
    var isPunt: Boolean = true
    var message: String = "Hello"
    var y = 7
    var z: Int = y
    y += 50
    val s: Short
    var bigNum: Long = y.toLong()
    var b: Byte = 2
    var smallNum = b.toShort()
//  b = smallNum --> returns an type error
//  isPunt = "false" --> returns an type error
    var k = y.toDouble()
//  b = k.toByte() --> returns a type error
    b = y.toInt().toByte()
    s = 0b100001
}