package Lec24;

public class Dice_Three_Face {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3,f=3;
		System.out.println(printPath(n, 0, "",f));

	}
	public static int printPath(int n,int curr,String ans,int f) {
		if(n==curr) {
			System.out.println(ans);
			return 1;
		}
		if(n<curr) {
			return 0;
		}
		int cou=0;
//		printPath(n, curr+1, ans+1);
//		printPath(n, curr+2, ans+2);
//		printPath(n, curr+3, ans+3);
		for(int i=1;i<f;i++) {
			cou = printPath(n,curr+i,ans+i,f)+cou;
		}
		return cou;
	}

}
