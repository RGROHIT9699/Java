package Lec29;

public class Palindrome_Partitioning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ques= "aab";
		partitioning(ques,"");
	}
	public static void partitioning(String ques,String ans) {
		if(ques.length()==0) {
			System.out.println(ans);
			return;
		}
		for(int i=1;i<=ques.length();i++) {
			String s = ques.substring(0,i);
			if(palindrome(s))
				partitioning(ques.substring(i),ans+s+"|");
		}
	}
	public static boolean palindrome(String ans) {
		int i=0;
		int j=ans.length()-1;
		while(i<=j) {
			if(ans.charAt(i)!=ans.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

}
