public class Problem2 {
    public void solve() {
        int result = 0;
        int next_number;
        
        int first = 1;
        int second = 1;

        for (int i = 0; first < 4_000_000; i++) {
            next_number = first + second;
            if (next_number % 2 == 0) {
                result += next_number;
            }
            second = first;
            first = next_number;
        }
        System.out.println(result);
    }
}
