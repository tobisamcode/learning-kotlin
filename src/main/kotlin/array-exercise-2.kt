fun main(args: Array<String>) {
    val firemen = arrayOf("Pugh", "Pugh", "Barney McGrew", "Cuthbert", "Dibble", "Grub")
    var fireManNo = 0;

    while (fireManNo < 6) {
        println("fireman number $fireManNo is ${firemen[fireManNo]}")
        fireManNo += 1
    }
}