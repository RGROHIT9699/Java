package Asg3;

import java.util.Scanner;

public class Rotate_Image {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        int[][] arr = new int[q][q];
        for (int i = 0; i < q; i++) {
            for (int j = 0; j < q; j++) {
                arr[j][i] = sc.nextInt();
            }
        }
        rotate(arr, q);
        sc.close();
    }

    public static void rotate(int[][] arr, int q) {
        for (int i = q - 1; i >= 0; i--) {
            for (int j = 0; j < q; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
