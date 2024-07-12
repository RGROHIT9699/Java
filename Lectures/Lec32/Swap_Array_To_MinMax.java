package Lec32;

import java.util.Arrays;

public class Swap_Array_To_MinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {5,7,4,8,3,6};
		int index  = arr.length-1;
		System.out.println(partition(arr, 0, index));
		System.out.println(Arrays.toString(arr));
	}
	public static int partition(int[] arr,int li,int ei) {
		int item = arr[ei];
		int idx=li;
		for(int i=li;i<arr.length;i++) {
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
