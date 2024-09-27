import java.util.Scanner;

public class Word_59A {

    public static void main(String[] args) {
        Scanner qw = new Scanner(System.in);
        String str = qw.next();
        int cl = 0;
        int cu = 0;
        for(int i=0;i<str.length();i++) {
            char cc = str.charAt(i);
            if(Character.isUpperCase(cc)) {
                cu++;
            } else {
                cl++;
            }
        }
        if(cl<cu){
            for(int i=0;i<str.length();i++){
                char cc = str.charAt(i);
                System.out.print(Character.toUpperCase(cc));
            }
        } else {
            for(int i=0;i<str.length();i++){
                char cc = str.charAt(i);
                System.out.print(Character.toLowerCase(cc));
            }
        }
        qw.close();
    }
}