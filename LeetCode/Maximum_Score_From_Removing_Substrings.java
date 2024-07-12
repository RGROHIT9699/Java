import java.util.Scanner;

public class Maximum_Score_From_Removing_Substrings {

    public static void main(String[] args) {
        Scanner qw = new Scanner(System.in);
        String str = qw.next();
        int x = qw.nextInt();
        int y = qw.nextInt();
        System.out.println(maximumGain(str, x, y));
        qw.close();
    }
    public static int maximumGain(String s, int x, int y) {
        int to =0;
        if(x<y){
            int temp=x;
            x= y;
            y = temp;
            s = new StringBuilder(s).reverse().toString();
        }
        int acou=0;
        int bcou=0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == 'a'){
                acou++;
            }
            else if(ch =='b'){
                if(acou>0){
                    to+=x;
                    acou--;
                }
                else{
                    bcou++;
                }
            }
            else{
                to+= Math.min(acou,bcou)*y;
                acou=0;
                bcou=0;
            }
        }
        to+= Math.min(acou,bcou)*y;
        return to;
    }
}