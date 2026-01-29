package main

import (
	"log"
	"math"
)

// MINIMUM TIME VISITING ALL POINTS
// DIRECTIONS(horizontally, vertically or diagonally).
func minTimeToVisitAllPoints(points [][]int) int {
	// var seconds int
	for _, point := range points {
		log.Println("Point", point)
	}

	/// FIRST WALK A POINT TO B POINT
	/// BY GIVEN POINTS A(X1, y1) and B(x2, y2)
	/// Энэ томьёо нь хоёр координат нэгэн зэрэг өөрчлөгдөхөд диагональ хөдөлгөөнийг хамгийн үр дүнтэй гэж тооцдог.
	/// time  = max(|x2 - x1|,|y2 - y1|)
	totalTime := 0
	for i := 1; i < len(points); i++ {
		var max int
		// pTpTime := totalTime + (points[i][0] - points[i-1][0])
		maxA := int(math.Abs(float64(points[i][0] - points[i-1][0])))
		maxB := int(math.Abs(float64(points[i][1] - points[i-1][1])))
		if maxA > maxB {
			max = maxA
		} else {
			max = maxB
		}

		log.Println("max", math.Abs(float64(max)))
		//
		//log.Println("pTpTime", pTpTime)
		//if max < 0 {
		//	totalTime = totalTime + int(math.Abs(float64(max)))
		//} else {
		totalTime = totalTime + max
		//}
		////log.Println("Point", points[i-1])
		//log.Println("Time", totalTime)
	}

	return totalTime
}
