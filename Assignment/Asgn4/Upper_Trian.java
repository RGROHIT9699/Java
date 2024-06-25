package Asgn4;

import java.util.Scanner;

public class Upper_Trian {
    public static void main(String[] args) {
        Scanner qw = new Scanner(System.in);
        int qs = qw.nextInt();
        int[][] qarr = new int[qs][qs];
        for (int qi = 0; qi < qs; qi++) {
            for (int qj = 0; qj < qs; qj++) {
                qarr[qi][qj] = qw.nextInt();
            }
        }
        for (int qi = 0; qi < qs; qi++) {
            for (int qj = 0; qj < qs; qj++) {
                System.out.print(qarr[qj][qi] + " ");
            }
            System.out.println();
        }
        qw.close();
    }

    public static void upper(int[][] qarr) {
        for (int qi = 0; qi < qarr.length; qi++) {
            for (int qj = qi + 1; qj < qarr.length; qj++) {
                qarr[qj][qi] = 0;
            }
        }

    }
}
