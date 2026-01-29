func mergeAlternately(word1 string, word2 string) string {
	var result string
	for i := 0; i < len(word1) || i < len(word2); i++ {
		if i < len(word1) {
			result += string(word1[i])
		}
		if i < len(word2) {
			result += string(word2[i])
		}
	}
	return result
}
