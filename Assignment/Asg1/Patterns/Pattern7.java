import java.util.Scanner;

public class Pattern7 {
    public static void main(String args[]) {
        Scanner rg = new Scanner(System.in);
        int lm = rg.nextInt(), ii = 1, ro = 2 * lm + 1, str = lm, col = ro, spc = 1;
        while (ii <= ro) {
            int jj = 1;
            while (jj < spc) {
                System.out.print("  ");
                jj++;
            }
            int ll = 1;
            while (ll <= col) {
                if (ll >= (col / 2) + 1) {
                    System.out.print(str + " ");
                    str++;
                    ll++;
                } else {
                    System.out.print(str + " ");
                    str--;
                    ll++;
                }
            }
            if (ii > ro / 2) {
                spc--;
                str += 2;
                col += 2;
            } else {
                spc++;
                str -= 2;
                col -= 2;
            }
            ii++;
            System.out.println();
        }
        rg.close();
    }
}
