package Lec02;
import java.util.*;
public class Pattern18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int i=0,k=(int)n/2,t=1;
		while(i<=k) {
			int j=k;
			while(j>i) {
				System.out.print("  ");
				j--;
			}
			int l=0;
			while(l<i+t) {
				System.out.print("* ");
				l++;
			}
			i++;
			t++;
			System.out.println();
		}
		i=1;
		t=n-2;
		while(i<=k) {
			int j=1;
			while(j<=i) {
				System.out.print("  ");
				j++;
			}
			k=1;
			while(k<=t) {
				System.out.print("* ");
				k++;
			}
			i++;
			t-=2;
			System.out.println();			
		}
		sc.close();
	}

}
