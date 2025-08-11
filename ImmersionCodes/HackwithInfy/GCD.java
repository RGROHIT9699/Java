package HackwithInfy;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner qw = new Scanner(System.in);
        int n = qw.nextInt();
        int[] arr = new int[n];

        for (int i = 0;i<arr.length;i++) {
            arr[i] = qw.nextInt();
        }
        gcdComposition(arr, "", "", 0);
        qw.close();


    }
    public static void  gcdComposition(int[] arr,String ans1,String ans2,int i){
        if(i == arr.length) {
            System.out.println(ans1+ " and "+ans2) ;
            return;
        }
        gcdComposition(arr, ans1 + arr[i]+" ", ans2, i+1);
        gcdComposition(arr, ans1, ans2+arr[i]+" ", i+1);
    }
}
