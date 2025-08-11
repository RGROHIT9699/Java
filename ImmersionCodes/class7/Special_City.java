package class7;

import java.util.*;
public class Special_City {

    public static void main(String[] args) {
        Scanner qw = new Scanner(System.in);
        int n = qw.nextInt();
        int x= qw.nextInt();
        int y = qw.nextInt();
        int[] dis = new int[n+1];
        // for (int i =1;i<=n;i++) {
        //     for (int j =i+1;j<=n;j++) {
        //         int a = j-i;
        //         int b = Integer.MAX_VALUE;

        //         if(a<=x && b>=y) {
        //             b = x -i +1+ j-y;
        //         }

        //     }
        // }
        for (int i = 1;i<=n;i++) {
            if(i>x) {
                int mn = 1;
                int mx = n-1;
                dis[mn]++;
                dis[mx+1]--;
            } else {
                int mn = 1;
                int mx = y-i-1;
                dis[mn]++;
                dis[mx]--;
                mn = (y-i)-(y-x-1);
                mx = (n-i)-(y-x-1);
                dis[mn]++;
                dis[mx+1]--;
            }

        }
        for (int i = 1;i<=n;i++) {
            dis[i] += dis[i-1]; 
        }
        for (int i =1;i<n;i++) {
            System.out.println((dis[i] +" "));
        }
        qw.close();
    }
}