package Asg3;

import java.util.*;

public class Maximum_Circu {
    public static void main(String[] args) {
        Scanner qwe = new Scanner(System.in);
        int jj = qwe.nextInt();
        for (int t = 0; t < jj; t++) {
            int q = qwe.nextInt();
            int[] rar = new int[q];
            int rsum = 0;
            for (int ri = 0; ri < q; ri++) {
                rar[ri] = qwe.nextInt();
                rsum = rsum + rar[ri];
            }
            int rsu1 = rar[0], rsu2 = rar[0], rmx = rar[0], rmin = rar[0];
            for (int ri = 1; ri < q; ri++) {
                rsu1 = Math.max(rsu1 + rar[ri], rar[ri]);
                rmx = Math.max(rmx, rsu1);
                rsu2 = Math.min(rsu2 + rar[ri], rar[ri]);
                rmin = Math.min(rmin, rsu2);
            }
            if (rsum == rmin) {
                System.out.println(rmx);
            } else {
                rmx = Math.max(rmx, rsum - rmin);
                System.out.println(rmx);
            }
        }

        qwe.close();
    }
}

// class GFG {
// public static int maxCircularSum(int a[], int n) {
// // Corner Case
// if (n == 1)
// return a[0];

// // Initialize sum variable which store total sum of
// // the array.
// int sum = 0;
// for (int i = 0; i < n; i++) {
// sum += a[i];
// }

// // Initialize every variable with first value of
// // array.
// int curr_max = a[0], max_so_far = a[0],
// curr_min = a[0], min_so_far = a[0];

// // Concept of Kadane's Algorithm
// for (int i = 1; i < n; i++) {

// // Kadane's Algorithm to find Maximum subarray
// // sum.
// curr_max = Math.max(curr_max + a[i], a[i]);
// max_so_far = Math.max(max_so_far, curr_max);

// // Kadane's Algorithm to find Minimum subarray
// // sum.
// curr_min = Math.min(curr_min + a[i], a[i]);
// min_so_far = Math.min(min_so_far, curr_min);
// }
// if (min_so_far == sum) {
// return max_so_far;
// }

// // returning the maximum value
// return Math.max(max_so_far, sum - min_so_far);
// }

// // Driver code
// public static void main(String[] args) {
// int a[] = { 8, -8, 9, -9, 10, -11, 12 };
// int n = 7;
// System.out.println("Maximum circular sum is " + maxCircularSum(a, n));
// }
// }