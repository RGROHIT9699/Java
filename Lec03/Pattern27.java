package Lec03;

import java.util.Scanner;

public class Pattern27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i=1,t=1;
		while(i<=n) {
			//space
			int j=1;
			while(j<=n-i) {
				System.out.print("  ");
				j++;
			}
			int k=1;
//			Number
			int val=1;
			while(k<=t) {
				
				System.out.print(val+" ");
				if (k<=t/2) {
				    val++;
			    }
				else {
					val--;
				}
				k++;
			}
			i++;
			t+=2;
			System.out.println();
		}
		sc.close();
		
	}

}