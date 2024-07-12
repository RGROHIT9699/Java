package Lec02;
import java.util.*;
public class Pattern30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int i=1;
		while(i<=n) {
			int j=n;
			while(j>0) {
				System.out.print(j+" ");
				j--;
			}
			i++;
			System.out.println();
		}
		sc.close();
	}

}
