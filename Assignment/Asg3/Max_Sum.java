package Asg3;

import java.util.Scanner;

public class Max_Sum {
    public static void main(String[] args) {
        Scanner qw = new Scanner(System.in);
        int n_o = qw.nextInt();
        int[] a_rr = new int[n_o];
        for (int i_ = 0; i_ < n_o; i_++) {
            a_rr[i_] = qw.nextInt();
        }
        System.out.println(max_Num(a_rr));
        qw.close();
    }

    public static int max_Num(int[] a_rr) {
        int q_ = Integer.MIN_VALUE;
        for (int i_ = 0; i_ < a_rr.length; i_++) {
            q_ = Math.max(a_rr[i_], q_);
        }
        return q_;

    }
}
