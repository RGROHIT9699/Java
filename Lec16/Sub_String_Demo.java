package Lec16;

public class Sub_String_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Hellodsafzgx";
		System.out.println(s.substring(2,7));
		System.out.println(s.substring(5));
		System.out.println(s.substring(5,5));
		System.out.println(s.substring(5,9));
		String s1= "Hello";
		printString(s1);

	}
	public static void printString(String s1) {
		for(int i=0;i<s1.length();i++) {
			for(int j=i+1;j<=s1.length();j++) {
				System.out.println(s1.substring(i,j));
			}
		}
	}

}
