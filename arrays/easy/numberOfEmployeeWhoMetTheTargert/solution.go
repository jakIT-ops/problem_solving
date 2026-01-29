func numberOfEmployeesWhoMetTarget(hours []int, target int) int {
	cnt := 0
	for i := range hours {
		if hours[i] >= target {
			cnt = cnt + 1
		}
	}
	return cnt
}
