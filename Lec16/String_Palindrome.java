package Lec16;

public class String_Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String s1="nitin";
		System.out.println(stringReverse(s1));

	}
	public static boolean stringReverse(String s1) {
		int l1= s1.length();
		for(int i=0,k=l1-1;i<=(l1/2);i++,k--) {
			if(s1.charAt(i)!=s1.charAt(k)) {
				return false;
			}
		}
		return true;
	}

}
