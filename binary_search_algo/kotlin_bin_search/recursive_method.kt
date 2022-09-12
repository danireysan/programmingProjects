fun main() {
    val array = arrayOf(1,3,4,5,6,7,8)
    val target = 8
    val high = array.size - 1
    val low = 0
    val result:Int = rBinarySearch(target, array, low, high)
    if(result == -1){
        println("The element is not in the array")
    }else{
        println("The element is at index: $result")
    }

}

fun rBinarySearch(target: Int, array: Array<Int>, low: Int, high: Int): Int {

    if(low <= high) {
        val sum = high + low
        val middle:Int =  sum / 2
        if(target == array[middle]) return middle
        return if(target < array[middle]) rBinarySearch(target, array, low, middle-1)
        else rBinarySearch(target, array, middle + 1, high)
    }
    return -1
}