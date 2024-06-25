package Asgn4;

import java.util.Scanner;

public class Max_Sum_Matrix {
    public static void main(String[] args) {
        Scanner qw = new Scanner(System.in);
        int ql = qw.nextInt();
        int qarr[][] = new int[ql][ql];
        for (int qi = 0; qi < ql; qi++) {
            for (int qj = 0; qj < ql; qj++) {
                qarr[qi][qj] = qw.nextInt();
            }
        }
        int res = 0;
        int qpos = 0;
        int sum;
        for (int qi = 0; qi < qarr.length; qi++) {
            sum = 0;
            for (int qj = 0; qj < qarr.length; qj++) {
                sum += qarr[qj][qi];
            }
            if (sum > res) {
                res = sum;
                qpos = qi + 1;
            }
        }
        System.out.println(qpos + " " + res);
        qw.close();
    }
}
