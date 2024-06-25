import java.util.Scanner;

public class Pattern9 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int sp = 0;
        int st = n + 1;
        while (row <= 2 * n + 1) {
            // sp
            int i = 1;
            while (i <= sp) {
                System.out.print(" " + " ");
                i++;
            }
            int j = 1;
            while (j <= st) {
                System.out.print("*" + " ");
                j++;
            }
            int k = 1;
            while (k < st) {
                if (k == st - 1 && row == st) {
                    k++;
                } else {
                    System.out.print("*" + " ");
                    k++;
                }
            }
            if (row < n + 1) {
                st -= 1;
                sp += 1;
            } else {
                st += 1;
                sp -= 1;
            }

            row++;
            System.out.println();
        }
        sc.close();
    }
}
// }