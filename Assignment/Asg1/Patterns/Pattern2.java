import java.util.*;
public class Pattern2 {

    public static void main (String args[]) {
        Scanner lr = new Scanner(System.in);
        int n = lr.nextInt();
        lr.close();
        int i=1,space=0,star=n,ro= (2*n)-1;
        while(i<= ro){
            int aj=1;
            while(aj<=star){
                System.out.print("*");
                aj++;
            }
            int kk=1;
            while(kk<space){
                System.out.print(" ");
                kk++;
            }
            int ll=1;
            while(ll<=star){
                System.out.print("*");
                ll++;
            }
            if (i<=n-1){
                star--;
                space+=2;
            }
            else{
                star++;
                space-=2;
            }
            System.out.println();
            i++;
        }
        lr.close();      

    }
}

