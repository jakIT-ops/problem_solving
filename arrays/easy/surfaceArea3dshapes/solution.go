
import "log"

// SURFACE AREA OF 3D SHAPES
// n x n сүлжээнд 1x1x1 шоо байрлуулснаар үүссэн 3D хэлбэрийн нийт гадаргуугийн талбайг тооцоолох.
// Сүлжээний нүд бүр нь тухайн нүдний өндрийг илэрхийлсэн бүхэл тоон утгыг агуулна.
// Гадаргуугийн талбайн тооцоололд эдгээр шоо дөрвөлжингийн ил гарсан бүх нүүрний талбай,
// түүний дотор хэлбэр бүрийн доод нүүр орно.
func surfaceArea(grid [][]int) int {
	var surfaceArea int
	n := len(grid)

	getHeight := func(i, j int) int {
		log.Println("height:  ", i, j)
		if i >= 0 && i < n && j >= 0 && j < len(grid[i]) {
			log.Println("height res:  ", grid[i][j])
			return grid[i][j]
		}
		return 0
	}

	for i := 0; i < len(grid); i++ {
		for j := 0; j < len(grid[i]); j++ {
			if grid[i][j] > 0 {
				// Top and bottom faces
				surfaceArea += 2

				// Side faces
				// Left
				surfaceArea += max(0, grid[i][j]-getHeight(i, j-1))
				// Right
				surfaceArea += max(0, grid[i][j]-getHeight(i, j+1))
				// Up
				surfaceArea += max(0, grid[i][j]-getHeight(i-1, j))
				// Down
				surfaceArea += max(0, grid[i][j]-getHeight(i+1, j))
			}
		}
	}
	return surfaceArea
}

func max(a, b int) int {
	if a > b {
		return a
	}
	return b
}
