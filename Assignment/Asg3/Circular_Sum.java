package Asg3;

import java.util.Scanner;

public class Circular_Sum {
    public static void main(String[] args) {
        Scanner qwe = new Scanner(System.in);
        int rt = qwe.nextInt();
        for (int rr = 0; rr < rt; rr++) {
            int rn = qwe.nextInt();
            int[] rarr = new int[rn];
            for (int ri = 0; ri < rn; ri++) {
                rarr[ri] = qwe.nextInt();
            }
            int rsum = 0, rans = Integer.MIN_VALUE, rsum1 = 0, rans1 = Integer.MIN_VALUE;
            int rsu = 0, ra = Integer.MIN_VALUE;
            for (int ri = 0; ri < rn; ri++) {
                rsum = rsum + rarr[(ri - 1 + rn) % rn];
                rsum1 = rsum1 + rarr[(ri + 1) % rn];
                rsu = rsu + rarr[ri];
                ra = Math.max(ra, rsu);
                rans = Math.max(rans, rsum);
                rans1 = Math.max(rans1, rsum1);
                if (rsum < 0) {
                    rsum = 0;
                }
                if (rsum1 < 0) {
                    rsum1 = 0;
                }
                if (rsu < 0) {
                    rsu = 0;
                }
            }
            System.out.println(ra + " " + rans + " " + rans1);
            rans = Math.max(rans, ra);
            rans = Math.max(rans, rans1);
            System.out.println(rans);
        }
        qwe.close();
    }
}
