package Asgn5;

import java.util.Scanner;

public class Check_Freq {
    public static void main(String[] args) {
        Scanner qw = new Scanner(System.in);
        String qtr = qw.next();
        int count = 0;
        char as = qtr.charAt(0);
        for (int qi = 0; qi < qtr.length(); qi++) {
            int cou = 0;
            for (int qj = qi + 1; qj < qtr.length(); qj++) {
                if (qtr.charAt(qj) == qtr.charAt(qi)) {
                    cou++;
                }
            }
            if (cou > count) {
                as = qtr.charAt(qi);
            }
        }
        System.out.println(as);
        qw.close();
    }

}
