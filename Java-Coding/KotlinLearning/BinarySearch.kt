class BinarySearch {
    fun binarySearch(arr: Array<Int>, target: Int): Int {
        var left = 0
        var right = arr.size - 1
        while (left <= right) {
            val mid = left + (right - left) / 2
            if (arr[mid] == target) {
                return mid
            } else if (arr[mid] < target) {
                left = mid + 1
            } else {
                right = mid - 1
            }
        }
        return -1
    }
}

fun main(args: Array<String>) {
    val arr = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    val searchOne = BinarySearch()
    println(searchOne.binarySearch(arr, 10))
}