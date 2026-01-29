impl Solution {
    pub fn find_error_nums(mut nums: Vec<i32>) -> Vec<i32> {
        let n = nums.len() as i32;
        let mut duplicate = -1;

        nums.sort();

        // 2. Давхардсан тоог олох
        for i in 1..nums.len() {
            if nums[i] == nums[i - 1] {
                duplicate = nums[i];
                break;
            }
        }

        // 3. Математик аргаар гээгдсэн тоог олох
        // 1-ээс n хүртэлх тооны нийлбэр: n * (n + 1) / 2
        let expected_sum = n * (n + 1) / 2;

        // Одоо байгаа массивын нийлбэр (давхардсан тоотойгоо)
        let actual_sum: i32 = nums.iter().sum();

        // Гээгдсэн тоо = Байх ёстой нийлбэр - (Одоо байгаа нийлбэр - Давхардсан тоо)
        let missing = expected_sum - (actual_sum - duplicate);

        vec![duplicate, missing]
    }
}
