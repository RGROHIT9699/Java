package Lec31;
//import java.util.*;
public class Check_Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=11;
		System.out.println(checking(n));

	}
	public static boolean checking(int n) {
		int div=2;
		while(div<=Math.sqrt(n)) {
			if(n%div==0) {
				return false;
			}
			div++;
		}
		return true;
	}

}
