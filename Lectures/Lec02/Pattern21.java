package Lec02;
import java.util.*;
public class Pattern21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int i=1,t=(n*2)-2;
		while(i<=n) {
			int j=0;
			while(j<i) {
				System.out.print("*");
				j++;
			}
			int k=1;
			while(k<t) {
				System.out.print(" ");
				k++;
			}
			int l=1;
			while(l<=i) {
				if (i==n && l==1) {
					System.out.print("*");
					l+=2;
				}
				else {
					System.out.print("*");
					l++;
				}
			}
			i++;
			t-=2;
			System.out.println();
		}
		sc.close();
	}

}
