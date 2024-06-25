package Asg3;

import java.util.Scanner;

public class Running_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        int[] arr = new int[q];
        for (int i = 0; i < q; i++) {
            arr[i] = sc.nextInt();
        }
        sortNo(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        sc.close();

    }

    public static void sortNo(int[] arr) {
        int[] arr1 = new int[arr.length];
        for (int k = 0; k < arr.length; k++) {
            arr1[k] = arr[k];
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                arr[i] = arr1[j] + arr[i];
            }
        }
    }
}
