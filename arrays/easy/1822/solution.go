	// 1822 sign of the product of an array
	// TOPIC ARRAY MATH
	// If there is a 0 in the array the answer is 0
	// To avoid overflow make all the negative numbers -1 and all positive numbers 1 and calculate the prod
	func arraySign(nums []int) int {
		// var productNum float64
		flag := 1
		for i := 0; i < len(nums); i++ {
			if nums[i] == 0 {
				return 0
			}
			if nums[i] < 0 {
				flag *= -1
			}
		}
		return flag
	} 
