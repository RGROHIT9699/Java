package Asgn4;

import java.util.Scanner;

public class Painters {
    public static void main(String[] args) {
        Scanner qw = new Scanner(System.in);
        int qk = qw.nextInt();
        int qn = qw.nextInt();
        int[] qarr = new int[qn];
        for (int qi = 0; qi < qn; qi++) {
            qarr[qi] = qw.nextInt();
        }
        System.out.println(partitionPAint(qarr, qn, qk));
        qw.close();
    }

    public static int partitionPAint(int qarr[], int n, int k) {
        int lo = maximum(qarr, n);
        int hi = sum(qarr, n);

        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            int requiredPainters = noOfPainters(qarr, n, mid);

            if (requiredPainters <= k)
                hi = mid;

            else
                lo = mid + 1;
        }
        return lo;
    }

    public static int maximum(int qarr[], int n) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (qarr[i] > max)
                max = qarr[i];
        }
        return max;
    }

    public static int sum(int qarr[], int n) {
        int total = 0;
        for (int i = 0; i < n; i++) {
            total += qarr[i];
        }
        return total;
    }

    public static int noOfPainters(int qarr[], int n, int maxLen) {
        int total = 0, noPainters = 1;
        for (int i = 0; i < n; i++) {
            total += qarr[i];
            if (total > maxLen) {
                total = qarr[i];
                noPainters++;
            }
        }
        return noPainters;
    }
}
