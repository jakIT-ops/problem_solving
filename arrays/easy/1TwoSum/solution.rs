use std::collections::HashMap;

impl Solution {
    pub fn two_sum(nums: Vec<i32>, target: i32) -> Vec<i32> {
        // Create a hash map to store: { value: index }
        let mut map = HashMap::with_capacity(nums.len());

        for (i, &num) in nums.iter().enumerate() {
            let complement = target - num;

            // Check if the complement exists in our map
            if let Some(&index) = map.get(&complement) {
                return vec![index as i32, i as i32];
            }

            // Otherwise, insert current value and index into map
            map.insert(num, i);
        }

        // According to problem constraints, a solution always exists
        vec![]
    }
}
