var cache = make(map[int]int)

func climbStairs(n int) int {
	if val, ok := cache[n]; ok {
		return val
	}

	if n < 3 {
		return n
	}

	cache[n] = climbStairs(n-1) + climbStairs(n-2)
	return cache[n]
}
