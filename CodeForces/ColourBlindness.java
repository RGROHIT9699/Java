import java.util.Scanner;
public class ColourBlindness {
    public static void main(String[] args) {
        Scanner qw = new Scanner(System.in);
        int t = qw.nextInt();
        while (t-- > 0) {
            int n = qw.nextInt();
            String a = qw.next();
            String b = qw.next();
            StringBuilder ma = new StringBuilder(a);
            StringBuilder mb = new StringBuilder(b);
            for (int i = 0; i < n; i++) {
                if (ma.charAt(i) == 'B') {
                    ma.setCharAt(i, 'G');
                }
                if (mb.charAt(i) == 'B') {
                    mb.setCharAt(i, 'G');
                }
            }
            if (ma.toString().equals(mb.toString())) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        qw.close();
    }
}