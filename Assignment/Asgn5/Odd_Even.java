package Asgn5;

import java.util.Scanner;

public class Odd_Even {
    public static void main(String[] args) {
        Scanner qw = new Scanner(System.in);
        String qt = qw.next();
        for (int qi = 0; qi < qt.length(); qi++) {
            int qq = qt.charAt(qi);
            if (qi % 2 == 0) {
                qt = qt.substring(0, qi) + (char) (qq + 1) + qt.substring(qi + 1);
            } else {
                qt = qt.substring(0, qi) + (char) (qq - 1) + qt.substring(qi + 1);
            }
        }
        System.out.println(qt);
        qw.close();
    }
}
