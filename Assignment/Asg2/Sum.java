import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
         Scanner qw = new Scanner(System.in);
        int su=0;
        for(int i=1;i>0;i++){
            int q = qw.nextInt();
            su = su +q;
            if (su>=0){
                System.out.println(q);
            }
            else{
                break;
            }
        }  
        qw.close();     
    }
    
}
