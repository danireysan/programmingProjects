fun main() {
    val array = arrayOf<Int>(1,3,4,5,6,7,8)
    val target = 3
    val result:Int = iBinarySearch(target, array)
    if(result == -1){
        println("The element is not in the array")
    }else{
        println("The element is at index: $result")
    }

}

fun iBinarySearch(target: Int, array: Array<Int>): Int {
    var high = array.size - 1
    var low = 0
    while(low <= high) {
        val sum = high + low
        val middle:Int =  sum / 2
        if(target == array[middle]) return middle
        if(target < array[middle]) high = middle -1
        else{
            low = middle + 1
        }
    }
    return -1
}