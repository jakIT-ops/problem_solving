impl Solution {
    const SUBTRACT: &'static str = "-";
    const PLUS: &'static str = "+";
    const DIVISION: &'static str = "/";
    const MULTIPLY: &'static str = "*";
    pub fn eval_rpn(tokens: Vec<String>) -> i32 {
        let mut stack: Vec<i32> = Vec::new();
        let mut a: i32;
        let mut b: i32;

        for token in tokens {
            match token.parse::<i32>() {
                Ok(number) => {
                    stack.push(number);
                }
                Err(_) => {
                    b = stack.pop().unwrap();
                    a = stack.pop().unwrap();
                    match token.as_str() {
                        Self::PLUS => stack.push(a + b),
                        Self::SUBTRACT => stack.push(a - b),
                        Self::MULTIPLY => stack.push(a * b),
                        Self::DIVISION => stack.push(a / b),
                        _ => panic!("Invalid operator"),
                    }
                }
            }
        }
        stack.pop().unwrap()
    }
}
