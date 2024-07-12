package Lec02;
import java.util.*;
public class Pattern14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int i=1,j,k;
		while(i<=n) {
			j=1;
			while(j<=n-i) {
				System.out.print("  ");
				j++;				
			}
			k=1;
			while(k<=i) {
				System.out.print("* ");
				k++;
			}
			System.out.println();
			i++;
		}
		i=1;
		while(i<n) {
			j=1;
			while(j<=i) {
				System.out.print("  ");
				j++;
			}
			k=1;
			while(k<=n-i) {
				System.out.print("* ");
				k++;
			}
			i++;
			System.out.println();
		}
		sc.close();
	}

}
