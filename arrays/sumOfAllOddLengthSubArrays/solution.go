func sumOddLengthSubarrays(arr []int) int {
	sum := 0
	for i := 0; i < len(arr); i++ {
		for j := i; j < len(arr); j += 2 {
			for k := i; k <= j; k++ {
				sum += arr[k]
			}
		}
	}
	return sum
}
