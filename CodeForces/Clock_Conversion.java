import java.util.Scanner;

public class Clock_Conversion {
    public static void main(String[] args) {
        Scanner qw = new Scanner(System.in);
        int t = qw.nextInt();
        while (t-- > 0) {
            String str = qw.next();
            int h = Integer.parseInt(str.substring(0, 2));
            int m = Integer.parseInt(str.substring(3, 5));
            int cou = 0;
            if(h>=12){
                cou++;
            } 
            String s = "AM";
            if(cou == 1 ){
                s = "PM";
            }
            h = h % 12;
            if(h == 0){
                h = 12;
            } 
            String ans = h + ":" + m + " " + s;
            System.out.println(ans);
        }
    }
}
