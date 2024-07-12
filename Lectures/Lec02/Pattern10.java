package Lec02;
import java.util.*;
public class Pattern10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner pp  = new Scanner(System.in);
		int n = pp.nextInt();
		int i=1,t=(n*2)-1;
		while(i<=n) {
			int j=1;
			while(j<i) {
				System.out.print(" ");
				j++;
			}
			int k=0;
			while(k<t) {
				System.out.print("*");
				k++;				
			}
			System.out.println();
			t-=2;
			i++;	
		}
		pp.close();
	}

}
