package Lec02;

public class Pattern02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int i=1;
		
		while(i<=n) {
			int j=1;
			while(j<=i) {
				System.out.print("* ");
				j++;
			}
			System.out.println();
			i++;			
		}

	}

}
