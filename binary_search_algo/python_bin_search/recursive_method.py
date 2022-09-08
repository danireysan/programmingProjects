def binarySearch(arr, x, high, low):
    if(low>high):
        return -1
    mid = high + low // 2 

    if(x == arr[mid]):
        return mid
    if(x < arr[mid]):
        return binarySearch(arr, x, mid-1, low)
    if(x > arr[mid]):
        return binarySearch(arr, x, high, mid+1)


# Driver Code
arr = [2, 3, 4, 10, 40]
x = 1

high = len(arr)-1
low = 0
 
# Function call
result = binarySearch(arr, x, high, low)
 
if result != -1:
    print("Element is present at index % d" % result)
else:
    print("Element is not present in array")