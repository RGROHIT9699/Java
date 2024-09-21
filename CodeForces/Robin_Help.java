import java.util.Scanner;

public class Robin_Help {
    public static void main(String[] args) {
        Scanner qw = new Scanner(System.in);
        int t = qw.nextInt();
        while (t-- > 0) {
            int len = qw.nextInt();
            int k = qw.nextInt();
            int arr[] = new int[len]; 
            for(int i=0;i<len ;i++){
                arr[i] = qw.nextInt();
            }
            int to = 0;
            int ans = 0;
            for(int i= 0;i<len ;i++){
                if(arr[i]>= k) {
                    to += arr[i];
                } else {
                    if(to>0 && arr[i]==0) {
                        ans++;
                        to--;
                    }
                }
            }
            System.out.println(ans);
        }
        qw.close();
    }
}
