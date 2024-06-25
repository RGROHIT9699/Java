package Asg3;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner qw = new Scanner(System.in);
        int m = qw.nextInt();
        int n = qw.nextInt(), i = m;
        while (i <= n) {
            int sum = 0, sum1 = i;
            int q = (int) (Math.log10(i) + 1);
            int q1 = q;
            while (q1 > 0) {
                int rem = sum1 % 10;
                sum = (int) (Math.pow(rem, q)) + sum;
                sum1 /= 10;
                q1--;
            }
            if (sum == i) {
                System.out.println(i);
            }
            i++;
        }
        qw.close();
    }
}
