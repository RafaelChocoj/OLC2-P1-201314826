fn ack(m: i64, n: i64) -> i64 {
    if m == 0 {
        return n + 1;
    } else if n == 0 {
        return ack(m - 1, 1);
    } else {
        return ack(m - 1, ack(m, n - 1));
    }
}
 
fn main() {
    let a = ack(3, 5);
    println!("{}", a); // 253
}