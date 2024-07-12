package Lec02;
import java.util.*;
public class Pattern26 {

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
			while(k<i+t) {
				System.out.print(k);
				k++;
			}
			i++;
			t++;
			System.out.println();
		}
		sc.close();
	}

}
