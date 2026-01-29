
import "math"

func mySqrt(x int) int {
	fl := math.Sqrt(float64(x))
	return int(fl)
}
