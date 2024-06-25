import java.util.*;
public class Pattern5 {
    public static void main(String args[]) {
        Scanner rg = new Scanner(System.in);
        int lm = rg.nextInt(),ii=1;
        while(ii<=lm){
            int jj=1;
            while(jj<=ii){
                if (jj==1 || jj==ii){
                    System.out.print(ii);
                    jj++;
                }
                else{
                    System.out.print(0);
                    jj++;
                }
            }
            ii++;
            System.out.println();
        }
        rg.close();
    }
}


