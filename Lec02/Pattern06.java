package Lec02;

public class Pattern06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5,i=1;
		while(i<=n) {
			int j=0;
			while(j<=n-i) {
				System.out.print("*");
				j++;				
			}
			System.out.println();
			int k=0;
			while(k<i) {
				System.out.print("  ");
				k++;
			}
			i++;
		}
	}

}
