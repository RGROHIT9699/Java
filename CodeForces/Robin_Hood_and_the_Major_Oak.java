import java.util.Scanner;

public class Robin_Hood_and_the_Major_Oak {
    public static void main(String[] args) {
        Scanner qw = new Scanner(System.in);
        int t = qw.nextInt();
        while (t-- > 0) {
            long n = qw.nextLong();
            long k = qw.nextLong();
            long rem = n-k+1;
            long ans = ((n+1)/2) - (rem/2);
            if(ans%2 == 0){
                System.out.println("YES");
            } else{
                System.out.println("NO");
            }
        }
        qw.close();
    }
}
