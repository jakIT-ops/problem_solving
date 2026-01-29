import "fmt"

// 283. Move Zeros
// Array, Two Pointer
func moveZeroes(nums []int) {
	slow := 0
	fast := 0

	for fast < len(nums) {
		if nums[fast] != 0 {
			nums[slow] = nums[fast]
			slow++
		}
		fast++
	}
	fmt.Println(nums)

	for slow < len(nums) {
		nums[slow] = 0
		slow++
	}
	fmt.Println(nums)

	//	fast заагч нь массив дундаас, тэгээс бусад элементүүдийг олох болно.
	//	slow заагч нь дараагийн тэг биш элементийг хаана байрлуулахыг бүртгэдэг.
	//	Эхний loop дараа бүх тэг биш элементүүдийг зөв байрлуулсан байна.
	//	Хоёр дахь loop нь үлдсэн байрлалыг тэгээр дүүргэн.
}
