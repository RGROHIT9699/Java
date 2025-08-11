package class1;
import java.util.*;

public class MovingPoints {

    public static void main(String[] args) {
        Scanner qw = new Scanner(System.in);
        int n = qw.nextInt();
        int[] x = new int[n];
        int[] v = new int[n];
        for (int i = 0;i<n;i++) {
            x[i] = qw.nextInt();
        }
        for (int i = 0;i<n;i++) {
            v[i] = qw.nextInt();
        }
        long ans = 0;
        for (int i=0;i<n;i++) {
            for (int j = i+1;j<n;j++) {
                long dx = x[i] - x[j];
                long dv = v[i] - v[j];
                if(dv ==0 || dx*dv>=0) {
                    ans += Math.abs(dx);
                }
            }
        }
        System.out.println(ans);
        qw.close();
    }
}