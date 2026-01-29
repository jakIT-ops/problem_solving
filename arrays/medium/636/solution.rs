impl Solution {
    pub fn exclusive_time(n: i32, logs: Vec<String>) -> Vec<i32> {
        let mut res = vec![0; n as usize];
        let mut stack: Vec<i32> = Vec::new();
        let mut prev_time = 0;

        println!("{}, num function", n);
        for log in logs {
            let parts: Vec<&str> = log.split(':').collect();
            let fid: i32 = parts[0].parse().unwrap();
            let is_start = parts[1] == "start";
            let curr_time: i32 = parts[2].parse().unwrap();

            if is_start {
                if let Some(&top_fid) = stack.last() {
                    res[top_fid as usize] += curr_time - prev_time;
                }
                stack.push(fid);
                prev_time = curr_time;
            } else {
                let top_fid = stack.pop().unwrap();
                res[top_fid as usize] += curr_time - prev_time + 1;
                prev_time = curr_time + 1;
            }
        }

        res
    }
}
