package Lec25;

public class Tower_Of_Hanoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		String src = "A";
		String src1 = "B";
		String src2 = "C";
		momentPrint(n, src, src1, src2);
		System.out.println((int)Math.pow(2, n)-1);

	}
	public static void momentPrint(int n, String src,String src1,String src2) {
		if(n==0) {
			return;
		}
		momentPrint(n-1, src, src2, src1);
		System.out.println("Move "+n +"th disk from "+src +" to "+ src2);
		momentPrint(n-1, src1, src, src2);
	}

}
