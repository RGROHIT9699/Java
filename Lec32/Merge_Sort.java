package Lec32;

import java.util.Arrays;

public class Merge_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {7,5,1,4,3,69,6541,4185,648,651};
		int[] arr2 = sorting(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr2));
	}
	static int nm=0;
	public static int[] sorting(int[] arr,int si,int ei) {
		System.out.println(nm);
//		nm--;
		if(si==ei) {
			int[] bs= new int[1];
			bs[0]= arr[si];
			return bs;
		}
		int mid = (si+ei)/2;
		int[] f = sorting(arr,si,mid);
		int[] ss = sorting(arr,mid+1,ei);
		return merge(f,ss);
	}
	public static int[] merge(int[] arr1,int[] arr2) {
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
		return arr3;
	}

}
