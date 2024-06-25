package Asg3;

import java.util.Scanner;

public class Inverse {
    public static void main(String[] args) {
        Scanner qw = new Scanner(System.in);
        int q = qw.nextInt();
        int[] arr = new int[q];
        for (int i = 0; i < q; i++) {
            arr[i] = qw.nextInt();
        }
        int i = 0;
        int[] new1 = new int[arr.length];
        while (i < q) {
            new1[arr[i]] = i;
            i++;
        }
        for (int ii = 0; ii < q; ii++) {
            System.out.print(new1[ii] + " ");
        }
        qw.close();
    }
}
