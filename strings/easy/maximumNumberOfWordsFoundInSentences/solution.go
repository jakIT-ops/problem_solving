import "strings"

func mostWordsFound(sentences []string) int {
	var maxWords int

	for _, sentence := range sentences {
		words := strings.Split(sentence, " ")
		if len(words) > maxWords {
			maxWords = len(words)
		}
	}
	return maxWords
}
