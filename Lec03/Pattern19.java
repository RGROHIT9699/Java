package Lec03;

public class Pattern19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=7,row=1,space=0,star=(n/2)+1;
		while(row<=n) {
			//star
			int j=1;
			while(j<=star) {
				System.out.print("* ");
				j++;
			}
			//space
			int k=1;
			while(k<space) {
				System.out.print("  ");
				k++;
			}
			//star
			int l=1;
			
			while(l<=star) {
				if ((row==1 || row==n) && l==1) {
					System.out.print("* ");
					l+=2;
				}
				else {
					System.out.print("* ");
					l++;
				}
			}
			if (row<=n/2) {
				star--;
				space+=2;
			}
			else {
				star++;
				space-=2;
			}
			row++;
			System.out.println();
		}
	}

}
