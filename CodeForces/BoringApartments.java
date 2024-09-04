import java.util.Scanner;

public class BoringApartments {
    public static void main(String[] args) {
        Scanner qw = new Scanner(System.in);
        int tt = qw.nextInt();
        while(tt-- >0) {
            int n = qw.nextInt();
            for(int i = 1;i<=9 ;i++){
                if(n == i*1) {
                    System.out.println((i-1)*10 +1);
                    break;
                } else if( n == i*11) {
                    System.out.println((i-1)*10 + 3);
                    break;
                } else if (n == i*111) {
                    System.out.println((i-1)*10 + 6);
                    break;
                } else if ( n == i*1111 ) {
                    System.out.println((i-1)*10 + 10);
                    break;
                }
            }
        } 
        qw.close();
    }
}
