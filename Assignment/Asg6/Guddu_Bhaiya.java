package Asg6;

import java.util.*;

public class Guddu_Bhaiya {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int m = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < m; i++) {
            StringTokenizer s = new StringTokenizer(sc.nextLine());
            int l = Integer.parseInt(s.nextToken());
            int r = Integer.parseInt(s.nextToken());
            int k = Integer.parseInt(s.nextToken());
            int k1 = Integer.parseInt(s.nextToken());
            System.out.println(k1);
            int numMoves = k % (r - l + 1);
            str = str.substring(0, l - 1) + str.substring(r - numMoves, r) + str.substring(l - 1, r - numMoves)
                    + str.substring(r);
        }
        System.out.println(str);
        sc.close();
    }
}
