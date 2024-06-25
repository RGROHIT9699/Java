package Anew1;

import java.util.*;

public class Hulk {
    public static void main(String args[]) {
        // Your Code Here
        Scanner qw = new Scanner(System.in);
        int q = qw.nextInt();
        while (q > 0) {
            int w = qw.nextInt(), w1 = 0;
            int sum = 0, mul = 1;
            while (w > 0) {
                int re = w % 2;
                sum = sum + re * mul;
                w /= 2;
                mul = mul * 10;
            }
            while (sum > 0) {
                int rem = sum % 10;
                if (rem == 1) {
                    w1++;
                }
                sum /= 10;
            }
            q--;
            System.out.println(w1);

        }
        qw.close();
    }
}
