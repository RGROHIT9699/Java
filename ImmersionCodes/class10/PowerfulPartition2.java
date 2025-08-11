package class10;

import java.util.*;
public class PowerfulPartition2 {
    public static void main(String[] args) {
        Scanner qw = new Scanner(System.in);
        int n = qw.nextInt();
        int k = qw.nextInt();
        int[] arr = new int[n];
        for (int i = 0;i<n;i++) {
            arr[i] = qw.nextInt();
        }
        long nn = partition(arr, k);
        System.out.println(nn);
        qw.close();
    }   
    static long mod = 1000_000_007l;
    public static long partition(int[] arr,int k) {
        int n = arr.length;
        long total_subset = power(2,n);
        long sub = sumUpToK(arr,k,n);
        long ans = (total_subset - (2*sub)%mod +mod)% mod;
        return ans;
    }
    private static long sumUpToK(int[] arr, int k, int n) {
        long[] dp = new long[k+1];
        for (int i =0;i<n;i++) {
            for (int j = k;j>=arr[i];j--) {
                dp[j] = (dp[j]+dp[j-arr[i]])%mod;
            }
        }
        long ans = 0;
        for (long v:dp) {
            ans = (ans + v) %mod;
        }
        return ans;
        
    }
    private static long power(int a, int n) {
        if(n==0) {
            return 1;
        }
        long x = power(a,n/2)%mod;
        x = (x*x)%mod;
        return x;
        
    }
}
