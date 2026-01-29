import "strings"

func finalString(s string) string {
	var result strings.Builder

	for _, ch := range s {
		if ch == 'i' {
			temp := []rune(result.String())
			for i, j := 0, len(temp)-1; i < j; i, j = i+1, j-1 {
				temp[i], temp[j] = temp[j], temp[i]
			}
			result.Reset()
			result.WriteString(string(temp))
		} else {
			result.WriteRune(ch)
		}
	}

	return result.String()
}
