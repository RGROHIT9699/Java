package Asg3;

import java.util.*;

class MaximumSumPath {
    // Utility function to find maximum of two integers

    // This function returns the sum of elements on maximum
    // path from beginning to end
    public static int maxPathSum(int ar1[], int ar2[], int m, int n) {
        // initialize indexes for ar1[] and ar2[]
        int i = 0, j = 0;

        // Initialize result and current sum through ar1[]
        // and ar2[].
        int result = 0, sum1 = 0, sum2 = 0;

        // Below 3 loops are similar to merge in merge sort
        while (i < m && j < n) {
            // Add elements of ar1[] to sum1
            if (ar1[i] < ar2[j])
                sum1 += ar1[i++];

            // Add elements of ar2[] to sum2
            else if (ar1[i] > ar2[j])
                sum2 += ar2[j++];

            // we reached a common point
            else {
                // Take the maximum of two sums and add to
                // result
                // Also add the common element of array,
                // once
                result += Math.max(sum1, sum2) + ar1[i];

                // Update sum1 and sum2 for elements after
                // this intersection point
                sum1 = 0;
                sum2 = 0;

                // update i and j to move to next element of
                // each array
                i++;
                j++;
            }
        }

        // Add remaining elements of ar1[]
        while (i < m)
            sum1 += ar1[i++];

        // Add remaining elements of ar2[]
        while (j < n)
            sum2 += ar2[j++];

        // Add maximum of two sums of remaining elements
        result += Math.max(sum1, sum2);

        return result;
    }

    // Driver code
    public static void main(String[] args) {
        // MaximumSumPath sumpath = new MaximumSumPath();
        Scanner qwe = new Scanner(System.in);
        int rt = qwe.nextInt();
        for (int rr = 0; rr < rt; rr++) {
            int rn1 = qwe.nextInt(), rn2 = qwe.nextInt();
            int[] rar1 = new int[rn1];
            int[] rar2 = new int[rn2];
            for (int ri = 0; ri < rn1; ri++) {
                rar1[ri] = qwe.nextInt();
            }
            for (int ri = 0; ri < rn1; ri++) {
                rar2[ri] = qwe.nextInt();
            }
            System.out.println(maxPathSum(rar1, rar2, rn1, rn2));
        }
        qwe.close();
    }
}