package Asgn5;

import java.util.Scanner;

public class Count_Vom {
    public static void main(String[] args) {
        Scanner qw = new Scanner(System.in);
        String str = qw.next();
        int cou = 0;
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
                    || str.charAt(i) == 'u') {
                count++;
            } else {
                // cou = count;
                count = 0;
            }
            if (cou < count) {
                cou = count;
            }
        }
        System.out.println(cou);
        // System.out.println(count);
        qw.close();
    }
}
