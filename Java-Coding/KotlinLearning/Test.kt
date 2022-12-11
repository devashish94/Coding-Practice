fun main() {
    val arr = arrayOf(1, 2, 3, 4)
    for (i in arr.iterator()) {
        if (i == 3) break
        print("$i ")
    }
}
