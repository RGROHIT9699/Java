package Asgn4;

import java.util.Scanner;

public class Moms {
    public static void main(String[] args) {
        Scanner qw = new Scanner(System.in);
        int qn = qw.nextInt();
        int[][] qarr = new int[qn][qn];
        for (int qi = 0; qi < qn; qi++) {
            for (int qj = 0; qj < qn; qj++) {
                qarr[qi][qj] = qw.nextInt();
            }
        }
        System.out.println(motivation(qarr));
        qw.close();
    }

    public static boolean motivation(int[][] qarr) {
        for (int qi = 0; qi < qarr.length; qi++) {
            for (int qj = qi + 1; qj < qarr.length; qj++) {
                if (qarr[qi][qj] != 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
