// 2481. Minimum Cuts to Divide a Circle
func numberOfCuts(n int) int {
	/// Тойргийн ирмэгийн хоёр цэгийг шүргэж, төвийг нь дайран өнгөрөх шулуун шугам.
	/// Тойргийн ирмэг ба түүний төвийн нэг цэгт хүрсэн шулуун шугам.
	if n == 1 {
		return 0
	} else if n == 2 {
		return 1
	}
	if n > 2 {
		if n%2 == 0 {
			return n / 2
		} else {
			return n
		}
	}
	return 0
}

