package Lec32;

import java.util.Arrays;

public class Merge_Two_Sorted_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] arr1= {1,2,3,5,6,8,11,19,20};
		int[] arr2= {1,2,5,6,9,10,45,76,87,91,99};
		int m = arr1.length;
		int n = arr2.length;
		int k=0,i=0,j=0;
		int[] arr3= new int[m+n];
		while(i<m && j<n) {
			if(arr1[i]<arr2[j] ) {
				arr3[k++]= arr1[i++];
			}
			else {
				arr3[k++]=arr2[j++];
			}
		}
		while(i<m) {
			arr3[k++]= arr1[i++];
		}
		while(j<n) {
			arr3[k++]= arr2[j++];
		}
		System.out.println(Arrays.toString(arr3));
		System.out.println(((Object) arr3).getClass().getSimpleName());

	}

}
