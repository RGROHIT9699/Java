import java.util.Scanner;

public class TalesOfASort {
    public static void main(String[] args) {
        Scanner qw = new Scanner(System.in);
        int t = qw.nextInt();
        while(t-->0){
            int n = qw.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++){  
                arr[i] = qw.nextInt();
            }
            int max = 0;
            for(int i=1;i<n;i++){
                if(arr[i]<arr[i-1]){
                    if(max<arr[i-1]){
                        max = arr[i-1];
                    }
                }
            }
            System.out.println(max);
        }
    }
}
