package Lec05;

public class Function_demo3 {
	static int val =100; 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hemlo");
		int a =8;
		int b=7;
		System.out.println(val);
		System.out.println(add(a,b));
		System.out.println(val);

	}

	public static int add(int a,int b) {
		int k= a+b;
		int x = sub(a,k);
		int val =90;
		Function_demo3.val = val+5;
		return x+k;		
	}
	public static int sub(int a, int b) {
		return a-b;
	}
}
