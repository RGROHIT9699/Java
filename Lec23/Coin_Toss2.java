package Lec23;

public class Coin_Toss2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		print(n,"");

	}
	public static void print(int n, String ans) {
		if(n==0) {
			System.out.println(ans);
			return;
		}
		String ch = "H";
		String ch1 = "T";
		if(ans.length()==0|| ans.charAt(ans.length()-1)!='H') {
			print(n-1,ans+ch);
			
		}
		print(n-1,ans+ch1);
	}
}
