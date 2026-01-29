import "strings"

func findWordsContaining(words []string, x byte) []int {
	var result []int
	for i, n := range words {
		if strings.Contains(n, string(x)) {
			result = append(result, i)
		}
	}
	return result
}
