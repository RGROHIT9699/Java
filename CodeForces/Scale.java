import java.util.*;

public class Scale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner qw = new Scanner(System.in);
        int tt = qw.nextInt();
        while(tt-->0){
            int matn = qw.nextInt();
            int matk = qw.nextInt();
            int[][] qm = new int[matn][matn];
            for (int a = 0; a < matn ; a++) {
                for (int b = 0; b < matn; b++) {
                    qm[a][b] = qw.nextInt(); 
                }
            }
            myMatrix(qm, matk, matn);
        }
        qw.close();
    }
	
    private static void myMatrix(int[][] qm,int matk,int matn){
        for (int a = 0; a < matn; a=a+matk ) {
            for (int b = 0; b < matn ; b=b+matk) {
            	System.out.print(qm[a][b]);
            }
            System.out.println();
        }
    }
}
