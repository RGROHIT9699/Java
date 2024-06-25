package Asg3;

import java.util.Scanner;

public class Binary_Search {
    public static void main(String[] args) {
        Scanner qw = new Scanner(System.in);
        int q = qw.nextInt();
        int[] arr = new int[q];
        for (int i = 0; i < q; i++) {
            arr[i] = qw.nextInt();
        }
        int fnd = qw.nextInt();
        System.out.println(binary(arr, 0, q - 1, fnd));
        qw.close();
    }

    public static int binary(int[] arr, int first, int last, int fnd) {
        int median = (first + last) / 2, index = -1;
        while (first <= last) {
            if (arr[median] < fnd) {
                first = median + 1;
            } else if (arr[median] == fnd) {
                index = median;
                break;
            } else {
                last = median - 1;
            }
            median = (first + last) / 2;
        }
        return index;
    }
}
