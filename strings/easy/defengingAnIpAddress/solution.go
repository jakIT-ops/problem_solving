import "strings"

func defangIPaddr(address string) string {
	res := strings.ReplaceAll(address, ".", "[.]")
	return res
}
