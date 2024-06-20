package Lec22;

public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a= 4;
		int n=3;
		System.out.println(powe(a,n));
	}
	public static int powe(int a,int n) {
		if(n==0) {
			return 1;
		}
		int pn = powe(a,n-1);
		return pn*a;
	}
}
