import "strings"

// Repeated SubString Pattern
// String Matching
func repeatedSubstringPattern(s string) bool {
	//firstChar := s[0]
	//var repeatWord string
	//var repeatedWordLength int
	//// speciel case
	//if len(s) == 1 {
	//	return false
	//}
	//
	//for i := 1; i < len(s); i++ {
	//	if s[i] == firstChar {
	//		repeatWord = s[:i]
	//		repeatedWordLength = len(repeatWord)
	//		log.Println(len(s[i:]) % repeatedWordLength)
	//		if len(s[i:])%repeatedWordLength == 0 {
	//			for j := i; j < len(s); j += repeatedWordLength {
	//				//log.Println("words: ", s[j:j+repeatedWordLength])
	//				if s[j:j+repeatedWordLength] != repeatWord {
	//					return false
	//				}
	//			}
	//		} else {
	//			return false
	//		}
	//		break
	//	}
	//}
	//return true
	return strings.Index(s[1:]+s, s) < len(s)-1
}

