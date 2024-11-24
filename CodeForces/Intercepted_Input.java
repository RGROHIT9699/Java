import java.util.HashMap;
import java.util.Scanner;

public class Intercepted_Input {
    public static void main(String[] args) {
        Scanner qw = new Scanner(System.in);
        int t = qw.nextInt();
        while (t-- > 0) {
            int n = qw.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = qw.nextInt();
            }
            int ans = n-2;
            HashMap<Integer,Integer> mp = new HashMap<>();
            for(int i=0;i<n;i++) {
                mp.put(arr[i],mp.getOrDefault(arr[i], 0)+1);
            }

            for(int i = 0;i<arr.length;i++) {
                int a = arr[i],b ;
                if(ans%a ==0){
                    b = ans/a;                     
                } else {
                    b = -2;
                }
                if(a==b && mp.getOrDefault(a,0)>=2) {
                    System.out.println(a+" " +b);
                    break;
                }
                if(b!=-2 && a!=b && mp.getOrDefault(a,0)>0 && mp.getOrDefault(b, 0)>0 ){
                    System.out.println(a+" "+b);
                    break;
                }
            }
        }
        System.out.println("hello");
        qw.close();
    }
}
