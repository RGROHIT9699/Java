package Lec07;

import java.util.Scanner;

public class Max_Num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner qw = new Scanner(System.in);
		int qwe= qw.nextInt();
		int[] arr = new int[qwe];
		for(int i=0;i<qwe;i++) {
			arr[i]=qw.nextInt();
		}
		System.out.println(maxNo(arr));
		qw.close();

	}
	public static int maxNo(int[] arr) {
		int max = arr[0];
//		int max1 = Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if (arr[i]>max) {
				max=arr[i];
			}
//			max1= Math.max(arr[i], max1);
		}
		return max;
	}
}
