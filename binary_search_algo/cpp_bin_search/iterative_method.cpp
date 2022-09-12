#include <stdio.h> 
int binarySearch(int target, int* array, int high, int low);
int main(void) {

    int array[] = {1,2,3,4,5};
    int low = 0;
    int high = sizeof(array) / sizeof(*array);
    int result = binarySearch(5, array, high, low);
    
    printf("The target is at: %i\n", result);

}

int binarySearch(int target, int* array, int high, int low) {
    

    while(low < high) {
        int middle = low + high / 2;
        
        if(target == array[middle]) return middle;
        if(target < array[middle]) high = middle-1;
        else low = middle +1;
    }
    return -1;
}

