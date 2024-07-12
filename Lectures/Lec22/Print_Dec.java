package Lec22;

public class Print_Dec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		pd(n);

	}
	public static void pd(int n) {
		if(n==1) {
			System.out.println(1);
			return;
		}
		System.out.println(n);
		pd(n-1);
	}

}
