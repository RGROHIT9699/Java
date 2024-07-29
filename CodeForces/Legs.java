import java.util.Scanner;

public class Legs {
    public static void main(String[] args) {
        Scanner qw = new Scanner(System.in);
        int tt = qw.nextInt();
        while(tt-->0){
            int n = qw.nextInt();
            int cou = n/4;
            if(n%4!=0){
                cou++;
            }
            System.out.println(cou);
        }
        qw.close();
    }
}
