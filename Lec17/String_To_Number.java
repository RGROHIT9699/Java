package Lec17;

public class String_To_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="65";
		char ch = str.charAt(0);
		String st = ch+"";
		int x= Integer.parseInt(str.charAt(0)+"");
		System.out.println(x);
		long y = Long.parseLong(st);
		System.out.println(y);
	}

}
