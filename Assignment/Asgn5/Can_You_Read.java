package Asgn5;

import java.util.*;

public class Can_You_Read {
    public static void main(String[] args) {
        Scanner qw = new Scanner(System.in);
        String qstr1 = qw.nextLine();
        printString(qstr1);
        qw.close();
    }

    public static void printString(String qstr) {
        int qi = 0, cou = 0;
        for (int qj = 0; qj < qstr.length(); qj++) {
            if (Character.isUpperCase(qstr.charAt(qj))) {
                System.out.print(qstr.substring(qi, qj));
                qi = qj;
                if (cou > 0) {
                    System.out.println();
                }
                cou++;
            }

        }
        System.out.println(qstr.substring(qi));
    }
}
