package Lec06;

public class Array_Swap_2 {
	public static void main(String [] args) {
		int[] arr= {1,2,3,4,5,6};
		System.out.println(arr[0]+" "+ arr[1]);
		Swap(arr,0,1);
		System.out.println(arr[0]+" "+arr[1]);

	}
	public static void Swap(int[] arr,int a, int b) {
		int temp=arr[a];
		arr[a]= arr[b] ;
		arr[b]=temp;
	}
}
