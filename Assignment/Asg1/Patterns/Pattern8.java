import java.util.Scanner;

public class Pattern8 {
    public static void main(String[] args) {
        Scanner qw = new Scanner(System.in);
        // int coe = qw.nextInt();
        int rows = qw.nextInt();
        int coe = 1;
        // rows = 6;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0 || i == 0) {
                    coe = 1;
                } else {
                    coe = coe * (i - j + 1) / j;
                }
                System.out.print(coe + " ");
            }
            System.out.println();
        }
        qw.close();
    }
}