package Asg3;

import java.util.Arrays;
import java.util.Scanner;

public class Roses {
    public static void main(String[] args) {
        Scanner qwe = new Scanner(System.in);
        int rt = qwe.nextInt();
        for (int r = 0; r < rt; r++) {
            int al = qwe.nextInt();
            int[] rar = new int[al];
            for (int ri = 0; ri < al; ri++) {
                rar[ri] = qwe.nextInt();
            }
            int t1 = qwe.nextInt();
            Arrays.sort(rar);
            int rans = 0;
            for (int ri = 0; ri < al / 2; ri++) {
                for (int rj = ri + 1; rj < al; rj++) {
                    if (rar[ri] + rar[rj] == t1) {
                        rans = Math.max(rar[ri], rans);
                    }
                }
            }
            System.out.println("Deepak should buy roses whose prices are " + rans + " and " + (t1 - rans) + ".");
        }
        qwe.close();
    }
}
