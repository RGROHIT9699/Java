package Lec19;

import java.util.*;

public class Arrays_Sum_Of_Two_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner qw = new Scanner(System.in);
		int m = qw.nextInt();
		int[] arr1= new int[m];
		for(int i =0;i<m;i++) {
			arr1[i]= qw.nextInt();
		}
		int n = qw.nextInt();
		int[] arr2= new int[m];
		for(int i =0;i<n;i++) {
			arr2[i]= qw.nextInt();
		}
		sumOfTwoArrays(arr1, arr2);
		qw.close();
	}
	public static void sumOfTwoArrays(int[] arr1,int[] arr2) {
		ArrayList<Integer> ll= new ArrayList<>();
		int i=arr1.length-1;
		int j=arr2.length-1;
		int carry=0;
		while(i>=0 && j>=0) {
			int sum = carry+arr1[i]+arr2[j];
			ll.add(sum%10);
			carry= sum/10;
			i--;
			j--;
		}
		while(i>=0) {
			int sum= carry+arr1[i];
			ll.add(sum%10);
			carry = sum/10;
			i--;
		}
		while(j>=0) {
			int sum = carry+ arr2[j];
			ll.add(sum%10);
			carry = sum/10;
			j--;
		}
		if(carry>0) {
			ll.add(carry);
		}
		for(int k=ll.size()-1;k>=0;k--) {
			System.out.print(ll.get(i)+" ");
		}
		System.out.print("End");
	}

}
