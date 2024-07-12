package Lec33;

public class Power_Func {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no =  9;
		int pow = 3; 
		System.out.println(power(no,pow));

	}
	public static int power(int n , int pow) {
		if(pow==0) {
			return 1;
		}
		int ans = power(n, pow/2);
		ans = ans *ans;
		if(pow%2 !=0) {
			ans *=n;
		}
		return ans;
	}

}
