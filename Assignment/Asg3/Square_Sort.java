package Asg3;

import java.util.Scanner;

public class Square_Sort {
    public static void main(String[] args) {
        Scanner qw = new Scanner(System.in);
        int q = qw.nextInt();
        int[] arr = new int[q];
        for (int i = 0; i < q; i++) {
            arr[i] = qw.nextInt();
        }
        square(arr);
        sort(arr);
        for (int q1 = 0; q1 < arr.length; q1++) {
            System.out.println(arr[q1]);
        }
        qw.close();

    }

    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void square(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * arr[i];
        }
    }
}
