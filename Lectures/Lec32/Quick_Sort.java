package Lec32;

import java.util.Arrays;

public class Quick_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {7,5,1,4,3,69,6541,4185,648,651};
		sorting(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));

	}
	public static void sorting(int[] arr,int si,int ei) {
		if(si>=ei){
			return;
			
		}
		int idx = partition(arr,si,ei);
		sorting(arr, si, idx-1);
		sorting(arr,idx+1,ei);
	}
	public static int partition(int[] arr,int li,int ei) {
		int item = arr[ei];
		int idx=li;
		for(int i=li;i<ei;i++) {
			if(arr[i]<=item) {
				int temp = arr[i];
				arr[i]=arr[idx];
				arr[idx++]=temp;
			}
		}
		int temp = arr[ei];
		arr[ei] = arr[idx];
		arr[idx]= temp;
		return idx;
	}

}
