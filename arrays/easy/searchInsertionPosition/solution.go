func searchInsert(nums []int, target int) int {
	low := 0
	high := len(nums) - 1
	notFind := 0

	for low <= high {
		mid := (low + high) / 2

		if nums[mid] < target {
			notFind = mid + 1
		}

		if nums[mid] == target {
			return mid
		}

		if nums[mid] < target {
			low = mid + 1
		} else {
			high = mid - 1
		}
	}
	return notFind
}

	
