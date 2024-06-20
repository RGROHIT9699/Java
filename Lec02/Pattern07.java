package Lec02;

import java.util.Scanner;

public class Pattern07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();		
		int i=1;
		while(i<=n){
			int j=1;
			while(j<=n) {
				if (j==1 || j==n || i==1 || i==n) {
					System.out.print("* ");
					j++;
				}
				else {
					System.out.print("  ");
					j++;
				}
			}
			System.out.println();
			i++;
		}
		sc.close();
	}

}
