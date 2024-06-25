import java.util.*;
public class Height {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        int []ro = new int[q];
        int []la= new int[q];
        for(int i=0;i<q;i++){
            int r=sc.nextInt();
            ro[i]=r;
            la[i]=r;
        }        
        for(int i=0;i<q;i++){
            for(int j=i+1;j<q;j++){
                int temp;
                if(ro[i]>ro[j]){
                    temp = ro[i];
                    ro[i]=ro[j];
                    ro[j]=temp;
                }
            }
        }
        int count=0;
        for(int i=0;i<q;i++){
            System.out.println(ro[i]+" "+la[i]);
            if (ro[i]!=la[i]){
                count++;
            }
        }
        System.out.print(count);
        sc.close();
    }
}