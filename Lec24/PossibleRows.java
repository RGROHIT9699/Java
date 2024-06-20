package Lec24;

public class PossibleRows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m=4;
		int n=4;
		printMat(m-1,n-1,0,0,"");
		System.out.println(k);
	}
	static int k = 0;
	public static void printMat(int m,int n,int l ,int b,String ans) {
		if(l==m && b==n) {
			System.out.println(ans);
			k++;
			return;
		}
		if(l>m || b>n) {
			return;
		}
		printMat(m,n,l,b+1,ans+"H");
		printMat(m,n,l+1,b,ans+"V");
		printMat(m,n,l+1,b+1,ans+"D");
	}

}
