import "strings"

func convertToBase7(num int) string {
	if num == 0 {
		return "0"
	}

	// Check if the number is negative and make it positive
	negative := num < 0
	if negative {
		num = -num
	}

	var base7Builder strings.Builder

	// Convert the number to base-7
	for num > 0 {
		remainder := num % 7
		base7Builder.WriteByte('0' + byte(remainder))
		num /= 7
	}

	if negative {
		base7Builder.WriteByte('-')
	}

	// Reverse the string because the remainders were added in reverse order
	base7 := []byte(base7Builder.String())
	for i, j := 0, len(base7)-1; i < j; i, j = i+1, j-1 {
		base7[i], base7[j] = base7[j], base7[i]
	}

	return string(base7)
}

