import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner qw = new Scanner(System.in);
        int t = qw.nextInt();
        while(t-- > 0) {
            int a = qw.nextInt();
            int b = qw.nextInt();
            int c = qw.nextInt();
            if(a+c == b || a+b==c || b+c == a){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        qw.close();
    }
}
