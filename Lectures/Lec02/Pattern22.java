package Lec02;
import java.util.*;
public class Pattern22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i =1 ,j,t=0;
		while(i<=n) {
			j=0;
			while(j<=n-i) {
				System.out.print("*");
				j++;
			}
			int k=1;
			while(k<i+t) {
				System.out.print(" ");
				k++;
			}
			int l=0;
			while(l<=n-i) {
				if (i==1 && l==1) {
					System.out.print("*");
					l+=2;
				}
				else {
					System.out.print("*");
					l++;
				}
			}
			System.out.println();
			i++;
			t++;
		}
		sc.close();
	}

}
