package class10;

import java.util.Scanner;

public class PowerfulPartition {
    static long mod = 1000_100_1001L;
    public static void main(String[] args) {
        Scanner qw = new Scanner(System.in);
        int n = qw.nextInt();
        int k = qw.nextInt();
        int[] arr = new int[n];
        long totalSum = 0l;
        for (int i = 0;i<n;i++) {
            arr[i] = qw.nextInt();
            totalSum +=arr[i];
        }
        System.out.println(partition(arr, n, k, totalSum, totalSum));
        qw.close();
    }
    public static long partition(int[] arr,int i,int k,long sum ,long totalSum) {
        long x = partition(arr, i+1, k, sum+arr[i], totalSum);
        long y = partition(arr, i+1, k, sum, totalSum);
        return Math.max(x,y);
    }
}
