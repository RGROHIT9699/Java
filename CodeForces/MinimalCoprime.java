import java.util.Scanner;

public class MinimalCoprime {

    public static void main(String[] args) {
        Scanner qw = new Scanner(System.in);
        int n = qw.nextInt();
        while(n-->0) {
            int a = qw.nextInt();
            int b = qw.nextInt();
            if (a== 1 && b==1) {
                System.out.println(1);
            } else {
                System.out.println(b-a);
            }
        }
        qw.close();
    }
}