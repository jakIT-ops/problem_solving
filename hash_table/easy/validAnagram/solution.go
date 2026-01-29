
import (
	"sort"
	"strings"
)

func SortString(w string) string {
	s := strings.Split(w, "")
	sort.Strings(s)
	return strings.Join(s, "")
}

// valid anagram /hash table, string, sorting/
func isAnagram(s string, t string) bool {
	str1 := SortString(s)
	str2 := SortString(t)

	if len(s) != len(t) {
		return false
	}

	for i := 0; i < len(str1); i++ {
		if str1[i] != str2[i] {
			return false
		}
	}
	return true
}

