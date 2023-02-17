public class Problem5 {
    public boolean check(int number) {
        for (int j = 20; j > 2; j--) {
            if (number % j != 0) {return false;}
        }
        return true;
    }

    public void solve() {
        for (int i = 20; i < Integer.MAX_VALUE; i += 20) {
            if (check(i)) {
                System.out.println(i);
                break;
            }
        }
    }
}
