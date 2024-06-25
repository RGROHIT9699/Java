package Asgn5;

import java.util.*;

public class Count_Palin {
    public static void main(String[] args) {
        Scanner qw = new Scanner(System.in);
        String qtr = qw.next();
        System.out.println(countPalin(qtr));
        qw.close();
    }

    public static int countPalin(String qtr) {
        int cou = 0;
        for (int qi = 0; qi < qtr.length(); qi++) {
            for (int qj = qi + 1; qj <= qtr.length(); qj++) {
                String str = qtr.substring(qi, qj);
                if (checkPalin(str)) {
                    cou++;
                }
            }
        }
        return cou;
    }

    public static boolean checkPalin(String qtr) {
        int len = qtr.length();
        for (int qi = 0, ql = len - 1; qi < len / 2; qi++, ql--) {
            if (qtr.charAt(ql) != qtr.charAt(qi)) {
                return false;
            }
        }
        return true;
    }
}
