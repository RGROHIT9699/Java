package Asgn4;

import java.util.Scanner;

public class Magic_Wand {
    public static void main(String[] args) {
        Scanner qw = new Scanner(System.in);
        int qr = qw.nextInt();
        int qc = qw.nextInt();
        int qk = qw.nextInt();
        int qs = qw.nextInt();
        char[][] qarr = new char[qr][qc];
        for (int qi = 0; qi < qr; qi++) {
            for (int qj = 0; qj < qc; qj++) {
                qarr[qi][qj] = qw.next().charAt(0);
            }
        }
        int qn = strength(qarr, qr, qc, qs);
        if (qn > qk) {
            System.out.println("Yes\n" + qn);
        } else {
            System.out.println("No");
        }
        qw.close();
    }

    public static int strength(char[][] qarr, int qr, int qc, int qs) {
        int res = 0;
        for (int qi = 0; qi < qr; qi++) {
            for (int qj = 0; qj < qc; qj++) {
                if (qj < qc - 1) {
                    if (qarr[qi][qj] == '.') {
                        qs = qs - 3;
                    }
                    if (qarr[qi][qj] == '*') {
                        qs = qs + 4;
                    }
                } else {
                    if (qarr[qi][qj] == '.') {
                        qs = qs - 2;
                    }
                    if (qarr[qi][qj] == '*') {
                        qs = qs + 5;
                    }
                }
                if (qarr[qi][qj] == '#') {
                    qj = qc;
                }
            }
        }
        res = qs;
        return res;
    }
}
