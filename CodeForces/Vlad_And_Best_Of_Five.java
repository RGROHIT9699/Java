import java.util.Scanner;

public class Vlad_And_Best_Of_Five {
    public static void main(String[] args) {
        Scanner qw = new Scanner(System.in);
        int t = qw.nextInt();
        while (t-- > 0) {
            String str = qw.next();
            int a = 0;
            int b = 0;
            for(int i=0;i<5;i++) {
                if(str.charAt(i) == 'A') {
                    a++;
                } else {
                    b++;
                }
            }
            if(a>b){
                System.out.println("A");
            } else {
                System.out.println("B");
            }
        }
        qw.close();
    }
}
