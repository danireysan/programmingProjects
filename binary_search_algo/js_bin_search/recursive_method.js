
function main() {
    const array = [1,3,5,7,9,11,13]
    var target = 5
    let low = 0;
    let high = array.length - 1;
    let result;
    result = binarySearch(target, array, low, high)

    if (result == -1) {
        console.log("The element was not found")
    } else {
        console.log("The result is: " + result)
    }
}

function binarySearch(target, array, low, high) {
    if (low<=high) {
       let middle = low + Math.floor((high - low) / 2);
       let arrayValue = array[middle]
       if(target==arrayValue) 
            return middle
       if(target<arrayValue) 
            binarySearch(target, array, low, middle -1)
       if(target>arrayValue)
            binarySearch(target, array, middle + 1, high) 
    }
    // Base case
    return -1
}

main()