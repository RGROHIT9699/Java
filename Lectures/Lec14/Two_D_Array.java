package Lec14;

import java.util.Scanner;

public class Two_D_Array {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int row= sc.nextInt();
		int col = sc.nextInt();
		int[][] arr=new int[row][col]; 
//		it is a collection of 1d array
//		System.out.println(arr);
//		System.out.println(arr[0]);
//		System.out.println(arr.length);
//		System.out.println(arr[0].length);
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				arr[i][j]= sc.nextInt();
			}
		}
		display(arr);
		sc.close();
		
	}
	public static void display(int[][] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}