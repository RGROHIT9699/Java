package Asg6;

import java.util.Scanner;

public class Friends {
    public static void main(String[] args) {
        try (Scanner qw = new Scanner(System.in)) {
            int q = qw.nextInt();
            int[] arr = new int[q];
            for (int qi = 0; qi < q; qi++) {
                arr[qi] = qw.nextInt();
            }
            int cou = 0;
            for (int qi = 1; qi < q; qi++) {
                if (age(arr[qi - 1], arr[qi])) {
                    cou++;
                }
            }
            System.out.println(cou);
        }
    }

    public static boolean age(int m, int n) {
        if (n <= 0.5 * m + 7) {
            return false;
        }
        if (n > m) {
            return false;
        }
        if (n > 100 && m < 100) {
            return false;
        }
        return true;
    }

}
