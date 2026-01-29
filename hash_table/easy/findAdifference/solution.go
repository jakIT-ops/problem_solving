func findTheDifference(word1 string, word2 string) byte {
	var result byte
	for i := 0; i < len(word1); i++ {
		result ^= word1[i]
	}
	for i := 0; i < len(word2); i++ {
		result ^= word2[i]
	}
	return result
}
