package Asg3;

import java.util.Scanner;

public class Max_Path {
    public static void main(String[] args) {
        Scanner qwe = new Scanner(System.in);
        int rt = qwe.nextInt();
        for (int rr = 0; rr < rt; rr++) {
            int rn1 = qwe.nextInt(), rn2 = qwe.nextInt();
            int[] rar1 = new int[rn1];
            int[] rar2 = new int[rn2];
            for (int ri = 0; ri < rn1; ri++) {
                rar1[ri] = qwe.nextInt();
            }
            for (int ri = 0; ri < rn1; ri++) {
                rar2[ri] = qwe.nextInt();
            }
            int ri = 0, rj = 0, rsum = 0, rsum1 = 0, rans = 0;
            while (ri < rn1 && rj < rn2) {
                if (rar1[ri] < rar2[rj]) {
                    rsum = rsum + rar1[ri++];
                } else if (rar1[ri] > rar2[rj]) {
                    rsum1 = rsum1 + rar2[rj++];
                } else {
                    rans = rans + Math.max(rsum, rsum1) + rar1[ri];
                    ri++;
                    rj++;
                    rsum = 0;
                    rsum1 = 0;
                }
            }
            while (ri < rn1) {
                rsum = rsum + rar1[ri++];
            }
            while (rj < rn2) {
                rsum1 = rsum1 + rar2[rj++];
            }
            rans = rans + Math.max(rsum, rsum1);
            System.out.println(rans);
        }
        qwe.close();
    }
}
