package Asgn5;

import java.util.Scanner;

public class Toggle {
    public static void main(String[] args) {
        Scanner qw = new Scanner(System.in);
        String qt = qw.next();
        for (int qi = 0; qi < qt.length(); qi++) {
            if (Character.isLowerCase(qt.charAt(qi)) == true) {
                qt = qt.substring(0, qi) + Character.toUpperCase(qt.charAt(qi)) + qt.substring(qi + 1);
            } else {
                qt = qt.substring(0, qi) + Character.toLowerCase(qt.charAt(qi)) + qt.substring(qi + 1);
            }
        }
        System.out.println(qt);
        qw.close();
    }

}
