import "sort"

// 1030. Matrix CELLS IN Distance order
// даалгавар бол матрицын бүх нүднүүдийн координатыг (rCenter, cCenter) хол зайд нь эрэмбэлэх явдал юм.
// manhattan distance: distance=∣r1−r2∣+∣c1−c2∣
func allCellsDistOrder(rows int, cols int, rCenter int, cCenter int) [][]int {
	var matrix [][]int
	// matrix initialize
	for i := 0; i < rows; i++ {
		for j := 0; j < cols; j++ {
			matrix = append(matrix, []int{i, j})
		}
	}
	// calculate distance
	sort.Slice(matrix, func(i, j int) bool {
		d1 := manhattanDistance(matrix[i][0], matrix[i][1], rCenter, cCenter)
		d2 := manhattanDistance(matrix[j][0], matrix[j][1], rCenter, cCenter)
		return d1 < d2
	})
	return matrix
}

func abs(x int) int {
	if x < 0 {
		return -x
	}
	return x
}

func manhattanDistance(row int, col int, rCenter int, cCenter int) int {
	return abs(row-rCenter) + abs(col-cCenter)
}

