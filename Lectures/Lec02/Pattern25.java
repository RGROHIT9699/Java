package Lec02;
import java.util.*;
public class Pattern25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int n= sc.nextInt();
		int i=1,j,k=1,g=1;
		while(i<=n) {
			j=1;
			while(j<=n-i) {
				System.out.print(" \t");
				j++;
			}
			while(k<i+g) {
				System.out.print(k+"\t");
				k++;
			}
			g=k+i;
			System.out.println();
			i++;
		}
		sc.close();
	}

}
