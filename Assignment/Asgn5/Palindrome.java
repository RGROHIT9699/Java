package Asgn5;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner qw = new Scanner(System.in);
        String qtr = qw.next();
        System.out.println(checkPalin(qtr));
        qw.close();
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
