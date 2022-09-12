package main

import "fmt"

func binarySearch(target int, array []int) int {
	high := len(array) - 1
	low := 0
	for low < high {
		middle := high + low/2

		if target == array[middle] {
			return middle
		}
		if target < array[middle] {
			high = middle - 1
		}

		low = middle + 1

	}
	return -1
}

func main() {
	array := []int{1, 3, 5, 7, 9, 11}
	target := 3

	result := binarySearch(target, array)

	if result == -1 {
		fmt.Println("The number is not in the array")
	} else {
		fmt.Println("The number is at: %i", result)
	}

}
