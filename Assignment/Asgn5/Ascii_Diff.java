package Asgn5;

import java.util.Scanner;

public class Ascii_Diff {
    public static void main(String[] args) {
        Scanner qw = new Scanner(System.in);
        String str = qw.next();
        int a1 = 0, a2 = 0;
        int len = str.length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < len; i++) {
            if (i == len - 1) {
                break;
            }
            if (i == 0) {
                sb.append(str.charAt(i) + "");
            }
            a1 = (int) str.charAt(i);
            a2 = (int) str.charAt(i + 1);
            int t2 = a2 - a1;
            sb.append(t2 + "" + str.charAt(i + 1));
        }
        System.out.println(sb.toString());
        qw.close();
    }
}
