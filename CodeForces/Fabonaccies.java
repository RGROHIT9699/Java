import java.util.*;
public class Fabonaccies {
    public static void main(String[] args) {
        Scanner qw = new Scanner(System.in);
        int tt = qw.nextInt();
        while (tt-- > 0) {
            int q1 = qw.nextInt();
            int q2 = qw.nextInt();
            int q4 = qw.nextInt();
            int q5 = qw.nextInt();

            int m = 0;
            for (int q3 = -100; q3 <= 100; q3++) {
                int cou = 0;
                if (q4 == q2 + q3) cou++;
                if (q5 == q3 + q4) cou++;
                if (q3 == q1 + q2) cou++;

                m = Math.max(m, cou);
            }

            System.out.println(m);
                
        }
        qw.close();
    }
}