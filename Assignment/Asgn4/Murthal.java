package Asgn4;

import java.util.*;

public class Murthal {
    public static void main(String[] args) {
        Scanner qw = new Scanner(System.in);
        int qp = qw.nextInt();
        int qn = qw.nextInt();
        int[] qarr = new int[qn];
        for (int qi = 0; qi < qn; qi++) {
            qarr[qi] = qw.nextInt();
        }
        Arrays.sort(qarr);
        System.out.println(calc(qp, qn, qarr));
        qw.close();
    }

    public static int tym(int rank, int par) {
        return (par * (par + 1) / 2) * rank;
    }

    public static boolean mintym(int par, int cooks, int ranks[], int m) {
        int j = 0, i = 1;
        while (par > 0) {
            if (tym(ranks[j], i) <= m) {
                i++;
                par--;
            } else {
                j++;
                if (j == cooks) {
                    return false;
                }
                i = 1;
            }
        }
        return true;
    }

    public static int calc(int par, int cooks, int ranks[]) {
        int s = tym(ranks[0], 1), e = tym(ranks[cooks - 1], par), m, ans = 0;
        while (s <= e) {
            m = (s + e) / 2;
            if (mintym(par, cooks, ranks, m)) {
                ans = m;
                e = m - 1;
            } else
                s = m + 1;
        }
        return ans;
    }
}
