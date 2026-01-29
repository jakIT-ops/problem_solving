import "math"

// LARGEST TRIANGLE AREA
// X-Y хавтгай дээр цэг бүрийг [xi, yi] хэлбэрээр илэрхийлсэн массив цэгүүд өгөгдсөн.
// энэ массиваас дурын гурван өөр цэг үүсгэж болох хамгийн том гурвалжны талбайг ол
func largestTriangleArea(points [][]int) float64 {
	var maxArea float64
	// The area of a triangle formed by three points (x1, y1), (x2,y2), and (x3,y3) can be calculated using the
	// Shoelace formula
	// Энэ томьёо нь гурвалжны талбайг оройгоороо тооцоолоход үр дүнтэй бөгөөд ойлгомжтой юм.
	area := func(p1, p2, p3 []int) float64 {
		return 0.5 * math.Abs(float64(p1[0]*(p2[1]-p3[1])+p2[0]*(p3[1]-p1[1])+p3[0]*(p1[1]-p2[1])))
	}

	// Iterate through all combinations of three points
	for i := 0; i < len(points); i++ {
		for j := i + 1; j < len(points); j++ {
			for k := j + 1; k < len(points); k++ {
				currentArea := area(points[i], points[j], points[k])
				if currentArea > maxArea {
					maxArea = currentArea
				}
			}
		}
	}
	return maxArea
}
