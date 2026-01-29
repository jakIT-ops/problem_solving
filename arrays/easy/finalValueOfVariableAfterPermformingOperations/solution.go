func finalValueAfterOperations(operations []string) int {
	var x int = 0
	for _, v := range operations {
		if v == "++X" || v == "X++" {
			x++
		} else {
			x--
		}
	}
	return x
}
