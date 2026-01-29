const (
	I = 1
	V = 5
	X = 10
	L = 50
	C = 100
	D = 500
	M = 1000
)

func romanToInt(s string) int {
	romanMap := map[rune]int{
		'I': I,
		'V': V,
		'X': X,
		'L': L,
		'C': C,
		'D': D,
		'M': M,
	}

	charList := []rune(s)

	sum := 0
	for i := 0; i < len(charList); i++ {
		if i < len(charList)-1 && romanMap[charList[i]] < romanMap[charList[i+1]] {
			sum -= romanMap[charList[i]]
		} else {
			sum += romanMap[charList[i]]
		}
	}
	return sum
}
