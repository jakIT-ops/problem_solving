func truncateSentence(s string, k int) string {
	var result string
	var count int
	for _, v := range s {
		if v == ' ' {
			count++
		}
		if count == k {
			break
		}
		result += string(v)
	}
	return result
}
