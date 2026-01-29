import "fmt"

func addBinary(a string, b string) string {
	i := len(a) - 1
	j := len(b) - 1
	carry := 0
	result := ""

	for i >= 0 || j >= 0 {
		sum := carry

		if i >= 0 {
			sum += int(a[i] - '0')
			i--
		}
		if j >= 0 {
			sum += int(b[j] - '0')
			j--
		}
		result = fmt.Sprintf("%d%s", sum%2, result)
		carry = sum / 2
	}
	if carry > 0 {
		result = fmt.Sprintf("1%s", result)
	}
	return result
}
