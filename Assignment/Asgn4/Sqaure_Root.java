package Asgn4;

import java.util.Scanner;

public class Sqaure_Root {
    public static void main(String[] args) {
        Scanner qw = new Scanner(System.in);
        long qn = qw.nextLong();

        System.out.println(sqRoot(qn));
        qw.close();
    }

    public static long sqRoot(long qn) {
        long qlo = 0l, res = 0l;
        long qhi = qn;
        while (qlo <= qhi) {
            long qmid = (qlo + qhi) / 2l;
            if (qmid * qmid == qn) {
                return qmid;
            } else if (qmid * qmid > qn) {
                qhi = qmid - 1;
                res = qmid;
            } else {
                qlo = qmid + 1;
            }
        }
        return res;
    }
}
