package Lec02;
import java.util.*;
public class Pattern29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int i=1,k=1;
		while(i<=n) {
			int j=1;
			while(j<=n-i) {
				System.out.print("  ");
				j++;
			}
			k=i;
			int l=1;
			while(l<i+k) {
				if(l==1 || l==((i+k)-1)) {
					System.out.print(k+" ");
					l++;
				}
				else {
					System.out.print("0 ");
					l++;
				}
			}
			i++;
			System.out.println();
			
		}
		sc.close();
	}

}
