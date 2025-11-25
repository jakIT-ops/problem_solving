// solution.rs
fn max_sub_array(nums: &[i32]) -> i32 {
    let mut cur = nums[0];
    let mut best = nums[0];
    for &x in &nums[1..] {
        if cur < 0 {
            cur = x
        } else {
            cur += x
        }
        if cur > best {
            best = cur
        }
    }
    best
}
fn main() {
    println!("{}", max_sub_array(&[-2, 1, -3, 4, -1, 2, 1, -5, 4]));
}
