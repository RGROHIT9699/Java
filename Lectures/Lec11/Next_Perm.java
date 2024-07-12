package Lec11;

import java.util.*;

public class Next_Perm {
    public static void main(String args[]) {
        Scanner rll = new Scanner(System.in);
        int rtst = rll.nextInt();
        int qq = 0;
        while (qq < rtst) {
            int lu = rll.nextInt();
            int[] luc = new int[lu];
            for (int rg = 0; rg < lu; rg++) {
                luc[rg] = rll.nextInt();
            }
            Permutation(luc);
            for (int rg = 0; rg < luc.length; rg++) {
                System.out.print(luc[rg] + " ");
            }
            qq++;
            System.out.println();
        }
        rll.close();
    }

    public static void Permutation(int[] arr) {
        int p = -1;
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] < arr[i + 1]) {
                p = i;
                break;
            }
        }
        if (p == -1) {
            rotat(arr, 0, arr.length - 1);
            return;
        }
        int q = -1;
        for (int i = arr.length - 1; i > p; i--) {
            if (arr[i] > arr[p]) {
                q = i;
                break;
            }
        }
        int temp = arr[p];
        arr[p] = arr[q];
        arr[q] = temp;
        rotat(arr, p + 1, arr.length - 1);

    }

    public static void rotat(int[] arr, int i, int j) {
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}