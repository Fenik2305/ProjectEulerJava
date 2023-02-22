import java.util.ArrayList;
import java.util.stream.Stream;
import java.util.stream.IntStream;
import java.util.Arrays;

public class Problem10 {
    public static ArrayList<Integer> getPrimes(int n) {
        boolean[] isPrime = new boolean[n + 1];
        ArrayList<Integer> primes = new ArrayList<>();

        for (int i = 0; i <= n; i++) {isPrime[i] = true;}
        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                for(int j = i * i; j <= n; j += i){
                    isPrime[j] = false;
                }
            }
        }
        
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                primes.add(i);
            }
        }
        return primes;
    }

    public static void solve() {
        int n = 2_000_000;
        ArrayList<Integer> myPrimes = getPrimes(n);
        System.out.println(myPrimes.stream().mapToLong(Integer::longValue).sum());
    }
}
