package Lec02;

public class Pattern09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5,i=1,t=0;
		while(i<=n) {
			int j=1;
			while(j<=n-i) {
				System.out.print(" ");
				j++;
			}
			int k=0;
				while(k<i+t){
					System.out.print("*");
					k++;
				}
			i++;
			t+=1;
			System.out.println();
		}
		
	}

}


