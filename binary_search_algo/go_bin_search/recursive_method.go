package main

import "fmt"

func rBinarySearch(target int, array []int, low int, high int) int {

	if low < high {
		middle := high + low/2

		if target == array[middle] {
			return middle
		}
		if target < array[middle] {
			return rBinarySearch(target, array, low, middle-1)
		} else {
			return rBinarySearch(target, array, middle+1, high)
		}

	}
	return -1
}

func mein() {
	array := []int{1, 3, 5, 7, 9, 11}
	target := 7
	high := len(array) - 1
	low := 0
	result := rBinarySearch(target, array, low, high)

	if result == -1 {
		fmt.Println("The number is not in the array")
	} else {
		fmt.Println("The number is at uwu:", result)
	}

}
