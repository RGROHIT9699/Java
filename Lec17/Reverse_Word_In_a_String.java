package Lec17;

public class Reverse_Word_In_a_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "	a good     example ";
		System.out.println(reverseWord(s));
		

	}
	public static String reverseWord(String s) {
		s= s.trim();
		String[] arr = s.split("\s+");
		String ans ="";
		for(int i= arr.length-1;i>=0;i--) {
			System.out.println(ans);
			ans= ans+arr[i]+" ";
			System.out.println(ans);
		}
		return ans.trim();
	}

}
