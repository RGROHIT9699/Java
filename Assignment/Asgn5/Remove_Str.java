package Asgn5;

import java.util.Scanner;

public class Remove_Str {
    public static void main(String[] args) {
        Scanner qw = new Scanner(System.in);
        String qtr = qw.next();
        StringBuilder qstr = new StringBuilder();
        int len = qtr.length();
        int qou = 1;
        for (int qi = 0; qi < len; qi++) {
            if (qi == len - 1) {
                qstr.append(qtr.charAt(qi) + "");
                break;
            }
            if (qtr.charAt(qi) == qtr.charAt(qi + 1)) {
                qou++;
            } else {
                qstr.append(qtr.charAt(qi));
                qstr.append(qou);
                qou = 1;
            }
        }
        System.out.println(qstr.toString());
        qw.close();
    }
}
