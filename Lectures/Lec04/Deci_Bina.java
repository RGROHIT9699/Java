package Lec04;

public class Deci_Bina {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int n=72,mul=1,sum =0;
		while(n>0) {
			int rem = n%2;
			sum = sum +rem*mul;
			n=n/2;
//			n=n/10;
			mul = mul*10;
//			mul = mul*2;
		}
		System.out.println(sum);
	}

}
