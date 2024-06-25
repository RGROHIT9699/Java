import java.util.Scanner;

public class Pattern6{
    public static void main(String args[]) {
        Scanner lm = new Scanner(System.in);
        int rg = lm.nextInt(),ii=1,aa=0,bb=1,cc=0;
        while(ii<=rg){
            int jj=1;
            while(jj<=ii){
                if (ii==1 && jj==1){
                    System.out.print(aa);
                }
                else {
                    System.out.print(bb);    
                }   
                jj++;

                cc=bb+aa;
                aa=bb;
                bb=cc;
 
            }
            ii++;
            System.out.println();
        }  
        lm.close();
    }    
}
