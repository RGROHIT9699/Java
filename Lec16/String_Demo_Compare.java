package Lec16;

public class String_Demo_Compare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Raj";
		String s2="Rajesh";
		System.out.println(s1.compareTo(s2));
		String s3="Kunal";
		String s4="Komal";
		System.out.println(s3.compareTo(s4));
		System.out.println(compareTo1(s1,s2));
		System.out.println(compareTo1(s3,s4));
		
	}
	public static int compareTo1(String s1,String s2) {
//		int rt=0;
//		if (s1.length()!=s2.length()) {
//			int count=0,k;
//			if (s1.length()>=s2.length()) {
//				k=s1.length();
//			}
//			else {
//				k=s2.length();
//			}
//			for(int i=0;i>k;i++) {
//				if (s1.charAt(i)==s2.charAt(i)) {
//					count++;
//				}
//			}
//		}
//		else if(s1.length()=s2.len)
//		return 0;
		int n=Math.min(s1.length(),s2.length());
		for(int i=0;i<n;i++) {
			if(s1.charAt(i)!=s2.charAt(i)) {
				return s1.charAt(i)-s2.charAt(i);
			}
		}
		return s1.length()-s2.length();
		
	}

}
