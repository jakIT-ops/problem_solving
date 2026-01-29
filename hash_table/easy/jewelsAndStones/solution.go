func numJewelsInStones(jewels string, stones string) int {
	var count int
	for _, v := range stones {
		for _, j := range jewels {
			if v == j {
				count++
			}
		}
	}
	return count
}
