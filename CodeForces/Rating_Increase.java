import java.util.Scanner;

public class Rating_Increase {
    public static void main(String[] args) {
        Scanner qw = new Scanner(System.in);
        int t = qw.nextInt();
        while(t-->0){
            int n = qw.nextInt();
            String str = n+"";
            boolean temp = false;
            String s = "";
            int k = str.length();
            for(int i=1;i<k;i++){
                String aa = str.substring(0,i);
                String bb = str.substring(i);
                if(aa.charAt(0) != '0' && bb.charAt(0) != '0' && Long.parseLong(aa)<Long.parseLong(bb)) {
                    s = aa + " " + bb;
                    temp = true;
                    // break;
                }
            }
            if(temp) {
                System.out.println(s);
            }
            else {
                System.out.println(-1);
            }
        }
    }
}
