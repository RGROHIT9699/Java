import java.util.Scanner;

public class Plus_One{
    public static void main(String[] args) {
        Scanner qw = new Scanner(System.in);
        int t = qw.nextInt();
        while(t-->0){
            int x1 = qw.nextInt();
            int x2 = qw.nextInt();
            int x3 = qw.nextInt();
            for(int i=0;i<5;i++){
                // int l = Math.max(Math.max(x1, x2), x3);
                int s = Math.min(Math.min(x1, x2), x3);
                if(x1==s){
                    x1++;
                }
                else if(x2==s){
                    x2++;
                }
                else if(x3==s){
                    x3++;
                }
            }
            int ans = x1*x2*x3;
            System.out.println(ans);
        }
    }
}