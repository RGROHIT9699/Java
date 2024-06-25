import java.util.*;
public class Inverse {
    public static void main(String args[]) {
        Scanner qw = new Scanner(System.in);
        long q = qw.nextLong(),su=0L,mu=1L,t2=0,q1=q;
        while(q1>0){
            t2++;
            q1/=10;
        }
        if (q==0){
            su=9;
        }
        else{
            long ii=1;
            while(ii<=t2){
                long re = q%10;
                long te = 9-re;
                // long ge= re;
                if (re>te && te!=0){
                    re=te;
                }
                // if (ge ==0){
                //     re=9;
                // }
                su = su + re * mu;
                q/=10;
                ii++;
                mu = mu*10;
            }
        }   
        System.out.print(su);
        qw.close();
    }
}