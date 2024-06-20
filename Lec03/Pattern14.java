package Lec03;
//Plane Mirror Concept

import java.util.*;
public class Pattern14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int i =1,j,space=n-1,star=1,row =(2*n)-1;
		while(i<=row) {
			j=1;
			while(j<=space) {
				System.out.print("  ");
				j++;
			}
			int k=1;
			while(k<=star) {
				System.out.print("* ");
				k++;
			}
			if(i>=n) {
				star--;
				space+=1;
			}
			else {
				star++;
				space-=1;
			}
			System.out.println();
			i++;			
		}
		sc.close();
	}

}
