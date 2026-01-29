func smallerNumbersThanCurrent(nums []int) []int {
	res := make([]int, len(nums))
	for i := 0; i < len(nums); i++ {
		count := 0
		for j := 0; j < len(nums); j++ {
			if i != j {
				if nums[i] > nums[j] {
					count++
				}
			}
		}
		res[i] = count
	}
	return res
}
