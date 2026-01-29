func strStr(haystack string, needle string) int {
	if len(needle) == 0 {
		return 0
	}

	n := len(haystack)
	m := len(needle)

	if n < m {
		return -1
	}

	for i := 0; i <= n-m; i++ {
		if haystack[i:i+m] == needle {
			return i
		}
	}

	return -1
}

