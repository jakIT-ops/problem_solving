
import (
	"strings"
)

func lengthOfLastWord(s string) int {
	slices := strings.Fields(s)
	leng := len(slices) - 1
	return len(slices[leng])
}
