import java.util.ArrayList;

public class Problem7 {
    public static boolean isPrime(int num, ArrayList<Integer> primes) {
        for (int prime: primes) {
            if (num % prime == 0) { return false;}
        }
        return true;
    }
    
    public static void solve() {
        int n = 10_001;
        int iterator = 3;

        ArrayList<Integer> primes = new ArrayList<>();
        primes.add(2);

        for (int i = 1; i < n; iterator += 2) {
            if (isPrime(iterator, primes)) {
                primes.add(iterator);
                i++;
            }
        }

        System.out.println(primes.get(--n));
    }
}
