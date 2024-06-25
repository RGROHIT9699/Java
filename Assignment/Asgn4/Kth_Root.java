package Asgn4;

import java.util.Scanner;

public class Kth_Root {
    public static void main(String[] args) {
        Scanner qw = new Scanner(System.in);
        int qt = qw.nextInt();
        while (qt-- > 0) {
            long qn = qw.nextLong();
            long qk = qw.nextLong();
            if (qk == 1) {
                System.out.println(qn);
                continue;
            }
            long ll = 1L;
            long qr = 1000000L;
            long qmid;
            while (ll < qr) {
                qmid = (ll + qr + 1) >> 1;
                boolean flag = true;
                long qtmp = 1L;
                for (int i = 1; i <= qk; i++) {
                    qtmp *= qmid;
                    if (qtmp > qn) {
                        flag = false;
                        break;
                    }
                }
                if (flag)
                    ll = qmid;
                else
                    qr = qmid - 1;
            }
            System.out.println(qr);
        }
        qw.close();
    }
}