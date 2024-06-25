import java.util.*;
public class Pattern1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i=1,j,space=2*n-3;
        sc.close();
        while(i<=n){
            j=1;
            while(j<=i){
                System.out.print(j);
                j++;
            }
            int k=1;
            while(k<=space){
                System.out.print(" ");
                k++;
            }
            j=i;
            while(j>=1){
                if (j==n && i==n){
                    j--;
                }
                else {
                    System.out.print(j);
                    j--;
                }
            }
            System.out.println();
            i++;
            space-=2;
        }
    }
}