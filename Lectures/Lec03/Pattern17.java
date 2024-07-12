package Lec03;
import java.util.*;
public class Pattern17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int i=1,star=n/2,space=1;
		while(i<=n) {
			//star
			int j=1;
			while(j<=star) {
				System.out.print("* ");
				j++;
			}
			//space
			int k=1;
			while(k<=space) {
				System.out.print("  ");
				k++;
			}
			//star
			int l=1;
			while(l<=star) {
				System.out.print("* ");
				l++;
			}
			//mirror
			if (i<=n/2) {
				star--;
				space+=2;
			}
			else {
				
				star++;
				space-=2;
			}
			i++;
			System.out.println();
		}
		sc.close();
	}

}
