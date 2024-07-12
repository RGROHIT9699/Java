package Lec17;

public class String_Print_Coordinate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Helol"; 
		subString(s);		

	}
	public static void subString(String str) {
		for(int len=1;len <=str.length();len++) {
			for(int j=len;j<=str.length();j++) {
				int i=j-len;
				System.out.println(str.substring(i, j));
			}
		}
	}

}
