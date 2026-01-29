impl Solution {
    pub fn shuffle(nums: Vec<i32>, n: i32) -> Vec<i32> {
        let mut res = Vec::new();
        for i in 0..n {
            let idx = i as usize;
            res.push(nums[idx]);
            res.push(nums[(n as usize) + idx]);
        }
        res
    }
}
