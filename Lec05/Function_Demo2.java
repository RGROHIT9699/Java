package Lec05;

public class Function_Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hey");
		int f=add();
		System.out.println(f);
	}
	public static int add() {
		int a= 69;
		int b=96;
		int c= a+b;
		sub();
		return(c);
	}
	public static void sub() {
		int a = 9;
		int b=6;
		System.out.println(a-b);		
	}

}
