import java.util.ArrayList;

public class Problem3 {
    public boolean isPrime(long num) {
        for (int i = 2; i < (int)Math.sqrt(num) + 1; i++) {
            if (num % i == 0) {return false;}
        }
        return true;
    }

    public void solve() {
        long n = 600_851_475_143L;
        int prime_limit = (int)Math.sqrt(n) + 1;

        ArrayList<Long> dividers = new ArrayList<>();

        for (int i = 1; i < prime_limit; i++) {
            if (n % i == 0 && isPrime(i)) {dividers.add((long)i);}
            if (n % i == 0 && n / i != i && isPrime(n / i)) {dividers.add(n / i);}
        }

        dividers.sort(null);

        System.out.println(dividers.get(dividers.size() - 1));
    }
}


