func maximumWealth(accounts [][]int) int {
	max := 0
	for _, v := range accounts {
		sum := 0
		for _, vv := range v {
			sum += vv
		}
		if sum > max {
			max = sum
		}
	}
	return max
}
