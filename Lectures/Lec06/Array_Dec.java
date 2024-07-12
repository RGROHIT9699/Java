package Lec06;
import java.util.*;

public class Array_Dec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner qw = new Scanner(System.in);
		int n= qw.nextInt();
		int []arr= new int[n];
		for(int i=0;i<n;i++) {
			arr[i]= qw.nextInt();
		}
		Display(arr);
		qw.close();
			
	}
	public static void Display(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

}
