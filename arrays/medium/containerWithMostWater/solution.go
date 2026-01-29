func maxArea(height []int) int {
	if len(height) < 2 {
		return 0
	}

	left, right := 0, len(height)-1
	maxArea := 0

	for left < right {
		width := right - left
		var h int
		if height[left] < height[right] {
			h = height[left]
			left++
		} else {
			h = height[right]
			right--
		}

		currentArea := width * h
		if currentArea > maxArea {
			maxArea = currentArea
		}
	}

	return maxArea
}

