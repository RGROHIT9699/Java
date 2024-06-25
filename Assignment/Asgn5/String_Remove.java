package Asgn5;

import java.util.*;

public class String_Remove {
    public static void main(String[] args) {
        Scanner qw = new Scanner(System.in);
        String qtr = qw.next();
        StringBuilder qstr = new StringBuilder();
        int len = qtr.length();
        int qou = 1;
        for (int qi = 0; qi < len; qi++) {
            if (qi == len - 1) {
                if (qou == 1) {
                    qstr.append(qtr.charAt(qi) + "");
                } else {
                    qstr.append(qtr.charAt(qi) + "" + qou);
                }
                break;
            }
            if (qtr.charAt(qi) == qtr.charAt(qi + 1)) {
                qou++;
            } else {
                if (qou == 1) {
                    qstr.append(qtr.charAt(qi) + "");
                } else {
                    qstr.append(qtr.charAt(qi) + "" + qou);
                }
                qou = 1;
            }
        }
        System.out.println(qstr.toString());
        qw.close();
    }

}