package Lec16;

public class String_Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="HelloByeok 1";
		System.out.println(s.length());
		System.out.println(s.charAt(7));
		String s1= "hello";
		String s2= new String("hello");
		System.out.println(equals1(s1, s2));
//		System.out.println(s1.equals(s2));
		
	}
	public static boolean equals1(String s1,String s2) {
		if(s1==s2) {
			return true;
		}
		int l1= s1.length();
		int l2= s2.length();
		if (l1!=l2) {
			return false;
		}
//		int count=0;
		for(int i=0;i<l2;i++) {
			if (s1.charAt(i)!=s2.charAt(i)) {
				return false;
			}
		}
//		for(int i=0;i<l2;i++) {
//			if (s1.charAt(i)==s2.charAt(i)) {
//				count++;
//			}
//		}
//		if (count==l1) {
//			return true;
//		}
		return true;
	}

}
