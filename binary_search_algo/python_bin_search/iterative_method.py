
def binarySearch(arr, target):
    high = len(arr)-1
    low = 0
    while low < high:
        mid = high + low // 2
        if(x == arr[mid]):
            return mid
        if(x < arr[mid]):
            high = mid-1
        if(x > arr[mid]):
            low = mid+1
           
    return -1
    

# Driver Code
arr = [2, 3, 4, 10, 40]
x = 3
 
# Function call
result = binarySearch(arr, x)
 
if result != -1:
    print("Element is present at index % d" % result)
else:
    print("Element is not present in array")