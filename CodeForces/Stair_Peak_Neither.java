import java.util.Scanner;

public class Stair_Peak_Neither {
    public static void main(String[] args) {
        Scanner qw = new Scanner(System.in);
        int t = qw.nextInt();
        while (t-- > 0) {
            int a = qw.nextInt();
            int b = qw.nextInt();
            int c = qw.nextInt();
            if(a < b && b < c) {
                System.out.println("Stair");
            } else if (a < b && b > c) {
                System.out.println("Peak");
            } else {
                System.out.println("None");
            }
        }
    }
}
