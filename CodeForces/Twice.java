import java.util.*;
public class Twice {
    public static void main(String[] args) {
        Scanner qw = new Scanner(System.in);
        int t = qw.nextInt();
        while (t-- > 0) {
            int num = qw.nextInt();
            int[] arr = new int[num];
            for (int i = 0; i < num; i++) {
                arr[i] = qw.nextInt();
            }
            int [] freq = new int[21];
            int cou = 0;
            for(int i = 0; i < num; i++) {
                freq[arr[i]]++;
            }
            for(int i=1;i<21;i++) {
                if(freq[i] !=0) {
                    if(freq[i]>=2){
                        cou += freq[i]/2;
                    }
                }
            }
            System.out.println(cou);
        }
        qw.close();
    }
}
