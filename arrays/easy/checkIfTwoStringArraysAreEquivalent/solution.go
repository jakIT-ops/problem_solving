func arrayStringsAreEqual(word1 []string, word2 []string) bool {
	var word1Str, word2Str string
	for _, v := range word1 {
		word1Str += v
	}
	for _, v := range word2 {
		word2Str += v
	}
	return word1Str == word2Str
}
