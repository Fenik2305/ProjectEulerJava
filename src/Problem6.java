public class Problem6 {
    public void solve() {
        int n = 100;

        int sqrt_of_sum = (n * (n + 1) / 2) * (n * (n + 1) / 2);
        int sum_of_sqrt = n * (n + 1) * (2 * n + 1) / 6;

        System.out.println(sqrt_of_sum - sum_of_sqrt);
    }
}
