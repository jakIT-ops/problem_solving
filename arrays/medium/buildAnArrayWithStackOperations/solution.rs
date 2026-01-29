impl Solution {
    pub fn build_array(target: Vec<i32>, n: i32) -> Vec<String> {
        let mut result: Vec<String> = Vec::new();
        let mut pass_idx: usize = 0;

        for i in 1..=n {
            if pass_idx == target.len() {
                break;
            }
            result.push("Push".to_string());

            if i == target[pass_idx] {
                pass_idx += 1;
            } else {
                result.push("Pop".to_string());
            }
        }
        result
    }
}
