import java.util.Scanner;

public class Rook {
    public static void main(String[] args) {
        Scanner qw = new Scanner(System.in);
        int t = qw.nextInt();
        char[] arr = {'a','b','c','d','e','f','g','h'};
        while(t-->0) {
            String str = qw.next();
            char ch = str.charAt(0);
            System.out.println(ch);
            int n = (int)(str.charAt(1)-'0');
            for(int i=1;i<9;i++) {
                if(i!=n){
                    String s = ch +"" +i;
                    System.out.println(s);
                }
                if(ch != arr[i-1]) {
                    String s = arr[i-1]+""+n;
                    System.out.println(s);
                }
            } 
        }   
        qw.close();
    }
}
