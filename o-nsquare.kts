fun printItems(n: Int) {
    for (i in 0 until n) {
        for (j in 0 until n) {
            println("$i $j")
        }
    }

    for (k in 0 until n) {
        println(k)
    }
} 

printItems(10)