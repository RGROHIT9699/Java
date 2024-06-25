package Asg3;

import java.util.*;

public class Operation {
    public static void main(String args[]) {
        Scanner qwe = new Scanner(System.in);
        int rt = qwe.nextInt();
        int[] rarr = new int[rt];
        for (int ri = 0; ri < rt; ri++) {
            rarr[ri] = qwe.nextInt();
        }
        int ot = qwe.nextInt();
        for (int oi = 0; oi < ot; oi++) {
            int oo = qwe.nextInt();
            int[] narr = new int[rt];
            for (int ri = 0; ri < rt; ri++) {
                narr[ri] = rarr[ri] + rarr[(ri + oo) % rt];
                // System.out.println(rarr[ri] + " " + rarr[(ri + oo) % rt]);
            }
            for (int ri = 0; ri < rt; ri++) {
                rarr[ri] = narr[ri];
            }
        }
        int rsum = 0;
        for (int ri = 0; ri < rt; ri++) {
            rsum = rarr[ri] + rsum;
        }
        int rl = rsum % (int) (Math.pow((double) 10, (double) 9) + 7);
        System.out.print(rl);
        qwe.close();

    }
}