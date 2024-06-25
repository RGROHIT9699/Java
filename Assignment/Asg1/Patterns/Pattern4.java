import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1, ro = 2 * n - 1, space = n - 1, g = 1, t = 1;
        while (i <= ro) {
            int j = 1;
            while (j <= space) {
                System.out.print(" \t");
                j++;
            }
            int k = 1;
            t = g;
            while (k <= g) {
                System.out.print(t + "\t");
                k++;
                t++;
            }
            t = t - 2;
            while (t >= g) {
                System.out.print(t + "\t");
                t--;
            }
            if (i >= n) {
                space++;
                g--;
            } else {
                space--;
                g++;
            }
            i++;
            System.out.println();
            sc.close();
        }
    }
}
