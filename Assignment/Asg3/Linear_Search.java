package Asg3;

import java.util.Scanner;

public class Linear_Search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        int[] arr = new int[q];
        for (int i = 0; i < q; i++) {
            arr[i] = sc.nextInt();
        }
        int m = sc.nextInt(), count = 1;
        for (int i = 0; i < q; i++) {
            if (arr[i] == m) {
                count = i;
                break;
            } else {
                count = -1;
            }
        }
        if (count >= 0) {
            System.out.print(count);
        } else {
            System.out.print(count);
        }
        sc.close();
    }

}
