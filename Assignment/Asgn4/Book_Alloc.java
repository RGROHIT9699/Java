package Asgn4;

import java.util.Scanner;

public class Book_Alloc {
    public static void main(String[] args) {
        Scanner qw = new Scanner(System.in);
        int qt = qw.nextInt();
        for (int bn = 0; bn < qt; bn++) {
            int ql = qw.nextInt();
            int qs = qw.nextInt();
            int[] qarr = new int[ql];
            for (int qi = 0; qi < ql; qi++) {
                qarr[qi] = qw.nextInt();
            }
            System.out.println(minPage(qarr, ql, qs));
        }
        qw.close();
    }

    public static int minPage(int[] qarr, int ql, int qs) {
        int qlo = 0;
        int qhi = 0;
        int res = 0;
        for (int qi = 0; qi < qarr.length; qi++) {
            qhi += qarr[qi];
        }
        while (qlo <= qhi) {
            int qmid = (qhi + qlo) / 2;
            if (itPossible(qarr, qs, qmid)) {
                res = qmid;
                qhi = qmid - 1;
            } else {
                qlo = qmid + 1;
            }
        }
        return res;
    }

    public static boolean itPossible(int[] qarr, int qs, int qmid) {
        int qstu = 1;
        int qread = 0;
        int qi = 0;
        while (qi < qarr.length) {
            if (qread + qarr[qi] <= qmid) {
                qread += qarr[qi];
                qi++;
            } else {
                qread = 0;
                qstu++;
            }
            if (qstu > qs) {
                return false;
            }
        }
        return true;
    }
}
