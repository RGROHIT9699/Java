package Lec22;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		System.out.println(facto(n));

	}
	public static int facto(int n) {
		if(n==0) {
			return 1;
		}
		int fn = facto(n-1);
		return n*fn;
	}

}
