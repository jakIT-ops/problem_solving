// solution.go
package main

import "fmt"

func maxSubArray(nums []int) int {
	// Kadane's algorithm
	maxSoFar := nums[0]
	cur := nums[0]
	for i := 1; i < len(nums); i++ {
		if cur < 0 {
			cur = nums[i]
		} else {
			cur += nums[i]
		}
		if cur > maxSoFar {
			maxSoFar = cur
		}
	}
	return maxSoFar
}

func main() {
	fmt.Println(maxSubArray([]int{-2, 1, -3, 4, -1, 2, 1, -5, 4}))
}
