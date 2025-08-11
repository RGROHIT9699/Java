import java.util.Scanner;

public class DivisibleByPrimes {
    private static final int[] primes = {2, 3, 5, 7, 11, 13, 17, 19};
    private static final int numPrimes = primes.length;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); 
        for (int i = 0; i < t; i++) {
            long n = scanner.nextLong();
            long count = inclusionExclusion(n,0,1,0);
            System.out.println(count);
        }
        scanner.close();
    }

    private static long inclusionExclusion(long n, int index, long lcm, int count) {
        if (index == numPrimes) {
            return (count % 2 == 0) ? 0 : n / lcm;
        }
        long result = inclusionExclusion(n, index + 1, lcm, count);
        long newLcm = lcm(lcm, primes[index]);
        if (newLcm <= n) {
            result += inclusionExclusion(n, index + 1, newLcm, count + 1);
        }
        return result; 
    }

    private static long lcm(long a, long b) {
        return (a / gcd(a, b)) * b;
    }

    private static long gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}