<<<<<<< HEAD
#include <stdio.h>
=======
#include <stdio.h> 
>>>>>>> 1a55d3db78a404cc78d9004b612b38e0c40ae929
int binarySearch(int target, int* array, int high, int low);
int main(void) {

    int array[] = {1,2,3,4,5};
    int low = 0;
    int high = sizeof(array) / sizeof(*array);
    int result = binarySearch(5, array, high, low);
<<<<<<< HEAD

=======
    
>>>>>>> 1a55d3db78a404cc78d9004b612b38e0c40ae929
    printf("The target is at: %i\n", result);

}

int binarySearch(int target, int* array, int high, int low) {
    
<<<<<<< HEAD
    while(low < high) {
        int middle = low + (high - low) / 2;

        printf("%i", array[middle]);

        if(target == array[middle]) return middle;
        if(target > array[middle]) low = middle + 1;
        else high = middle -1;
    }
    return -1;
}
=======

    while(low < high) {
        int middle = low + high / 2;
        
        if(target == array[middle]) return middle;
        if(target < array[middle]) high = middle-1;
        else low = middle +1;
    }
    return -1;
}

>>>>>>> 1a55d3db78a404cc78d9004b612b38e0c40ae929
