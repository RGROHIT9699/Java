package Lec22;

public class Print_Inc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		pi(n);

	}
	public static void pi(int n) {
		if(n==0) {
			return;
		}
		pi(n-1);
		System.out.println(n);
	}

}
