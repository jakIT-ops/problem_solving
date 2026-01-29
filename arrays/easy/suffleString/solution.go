
import "strings"

func restoreString(s string, indices []int) string {
	result := make([]string, len(s))
	// do not recom
	for i := 0; i < len(indices); i++ {
		result[indices[i]] = string(s[i])
	}

	return strings.Join(result, "")
}
