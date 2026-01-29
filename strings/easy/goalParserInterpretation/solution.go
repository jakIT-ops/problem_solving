func interpret(command string) string {
	var result string
	for i := 0; i < len(command); i++ {
		if command[i] == 'G' {
			result += "G"
		} else if command[i] == '(' && command[i+1] == ')' {
			result += "o"
		} else if command[i] == '(' && command[i+1] == 'a' {
			result += "al"
		}
	}
	return result
}

