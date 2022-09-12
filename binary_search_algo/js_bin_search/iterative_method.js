
function main() {
    const array = [1,3,5,7,9,11,13]
    var target = 11
    var result;
    result = binarySearch(target, array)

    if (result == -1) {
        console.log("The element was not found")
    } else {
        console.log("The result is: " + result)
    }
}

function binarySearch(target, array) {
    var low = 0
    var high = array.length - 1
    var middle;
    while(low < high) {
        middle = (high + low) / 2
        if (target == array[middle]) return middle
        if (target > array[middle]) low = middle + 1
        if (target < array[middle]) high = middle - 1
    }
    // Base case
    return -1
}

main()