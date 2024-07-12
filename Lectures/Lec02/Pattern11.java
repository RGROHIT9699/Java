package Lec02;
import java.util.*;

public class Pattern11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i=1,t=1;
		while(i<=n) {
			int j=1;
			while(j<=n-i) {
				System.out.print(" ");
				j++;
			}
			int k=1;
				while(k<i+t){
					if (k%2==0) {
						System.out.print(" ");
						k++;
					}
					else {
						System.out.print("*");
						k++;
					}
				}
			i++;
			t+=1;
			System.out.println();
		}
		sc.close();
	}

}
