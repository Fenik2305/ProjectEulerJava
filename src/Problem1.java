public class Problem1 {
    public static void solve() {
        int result = 0;

        for (int i = 0; i < 1000; i++) {
            if (i % 3 == 0 || i % 5 ==0) {
                result += i;
            }
        }
    
        System.out.println(result);
    }
}
