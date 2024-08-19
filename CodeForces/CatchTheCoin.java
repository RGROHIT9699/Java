import java.util.*;
public class CatchTheCoin {
    public static void main(String[] args) {
        Scanner qw = new Scanner(System.in);
        int t = qw.nextInt();
        while(t-->0){
            int x = qw.nextInt();
            int y = qw.nextInt();
            if(y < -1){
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }
}
