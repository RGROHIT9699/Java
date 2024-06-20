package Lec23;

public class Count_Subsq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ques= "abc";
		System.out.println(count(ques,""));

	}
	public static int count(String ques,String ans) {
		if(ques.length()==0) {
			System.out.print(ans+" ");
			return 1;			
		}
		char ch = ques.charAt(0);
		int a = count(ques.substring(1),ans);
		int b = count(ques.substring(1),ans+ch);
		return a+b;
	}
}
