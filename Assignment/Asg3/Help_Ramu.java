package Asg3;

import java.util.Scanner;

public class Help_Ramu {
    public static void main(String[] args) {
        Scanner qwe = new Scanner(System.in);
        int rt = qwe.nextInt();
        for (int r = 0; r < rt; r++) {
            int[] rar = new int[4];
            for (int ri = 0; ri < 4; ri++) {
                rar[ri] = qwe.nextInt();
            }
            int rn = qwe.nextInt();
            int rm = qwe.nextInt();
            int[] rn1 = new int[rn];
            int[] rm1 = new int[rm];
            for (int ri = 0; ri < rn; ri++) {
                rn1[ri] = qwe.nextInt();
            }
            for (int ri = 0; ri < rm; ri++) {
                rm1[ri] = qwe.nextInt();
            }
            int nsum = 0;
            for (int ri = 0; ri < rn; ri++) {
                int rs = Math.min((rn1[ri] * rar[0]), rar[1]);
                nsum = rs + nsum;
            }
            int ran = Math.min(nsum, rar[2]);
            int msum = 0;
            for (int ri = 0; ri < rm; ri++) {
                int rs = Math.min((rm1[ri] * rar[0]), rar[1]);
                msum = rs + msum;
            }
            int ram = Math.min(msum, rar[2]);
            int fan = Math.min((ran + ram), rar[3]);
            System.out.println(fan);
        }
        qwe.close();
    }

}
