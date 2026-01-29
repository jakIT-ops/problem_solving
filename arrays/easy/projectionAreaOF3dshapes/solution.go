
import "log"

// / PROJECTION AREA OF 3D SHAPES
// xy, yz, zx гэсэн гурван өөр хавтгайд нэгж шоо дөрвөлжин хэлбэртэй 3D хэлбэрийн проекцын нийт талбайг тооцоолоход оршино.
// XY (top view), YZ (front view), ZX (Side view)
func projectionArea(grid [][]int) int {
	// input: N x N grid  ---> output: total area XY, YZ, ZX
	log.Println(grid)
	// var totalArea int
	var XY, YZ, ZX int
	//// STEP 1 calc XY
	//log.Println("len grid", len(grid))
	//for i := 0; i < len(grid); i++ {
	//	// STEP 2 calc YZ
	//	//log.Println("THIS IS  I ", grid[i])
	//	for j := 0; j < len(grid[i]); j++ {
	//		//log.Println("THIS IS IJ ", grid[i][j])
	//
	//		if grid[i][j] > YZ {
	//			YZ = grid[i][j]
	//		}
	//		for k := 0; k < len(grid[i]); k++ {
	//			XY += 1
	//			//if grid[i][j] > YZ {
	//			//	YZ = grid[i][j]
	//			//}
	//
	//		}
	//	}
	//	XY += 1
	//}

	// NESTED LOOP
	for i := 0; i < len(grid); i++ {
		maxRow := 0
		maxCol := 0
		for j := 0; j < len(grid[i]); j++ {
			if grid[i][j] > 0 {
				XY++
			}
			if grid[i][j] > maxRow {
				maxRow = grid[i][j]
			}
			if grid[j][i] > maxCol {
				maxCol = grid[j][i]
			}
		}
		YZ += maxRow
		ZX += maxCol

	}
	return XY + YZ + ZX
}
