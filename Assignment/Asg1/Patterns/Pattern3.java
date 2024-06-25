// import java.util.*;
public class Pattern3 {
    public static void main(String args[]) {
        // Scanner sq = new Scanner(System.in);
        // int nn= sq.nextInt();
        int nn=4;
        int ii=1, spce=nn,str=1,t=-1;
        while(ii<=nn){
            int jj=1;
            while(jj<spce){
                System.out.print(" ");
                jj++;
            }
            int kk=ii;
            while(kk<=str){
                System.out.print(kk);
                kk++;
            }
            kk=kk-ii+t;
            // if (ii !=1){
                while(kk>=ii){
                   System.out.print(kk);
                   kk--;
                }
            // }            
            str+=2;
            spce--;
            ii++;
            t++;
            System.out.println();

        }

    }
}