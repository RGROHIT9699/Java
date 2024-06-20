package Lec01;

public class Sum_Of_Digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=2348;
		int s=0,b;
		while (n>0) {
			b=n%10;
			s = s+b;
			n=n/10;
		}
		System.out.println(s);

	}

}
