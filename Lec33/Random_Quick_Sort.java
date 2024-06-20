package Lec33;

import java.util.Arrays;
import java.util.Random;

public class Random_Quick_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5,6,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58,59,60,61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,7};
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
		Random rn = new Random();
		int val = rn.nextInt(ei-li)+li;
		System.out.println(val);
		int t = arr[val];
		arr[val]=arr[ei];
		arr[ei]= t;
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
