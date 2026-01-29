impl Solution {
    pub fn smaller_numbers_than_current(nums: Vec<i32>) -> Vec<i32> {
        let mut sorted_nums = nums.clone();
        // Sort the cloned vector to easily count smaller numbers
        sorted_nums.sort_unstable();

        // Use a hashmap to store the first occurrence of each number,
        // which represents the count of smaller numbers.
        use std::collections::HashMap;
        let mut map = HashMap::new();

        for (i, &num) in sorted_nums.iter().enumerate() {
            // If the number is not in map, this is its first occurrence,
            // meaning 'i' numbers are smaller than it.
            map.entry(num).or_insert(i as i32);
        }

        // Map the original numbers to their smaller count
        nums.iter().map(|&num| *map.get(&num).unwrap()).collect()
    }
}
