package Lec07;

public class Reverse_No {
	public static void main(String[] args) {
		int arr[]= {2,4,5,1,7,9};
		reverseNo(arr);
		printNo(arr);
	}
	public static void reverseNo(int[] arr) {
		int i=0,j=arr.length-1;
		while(i<j) {
			int temp = arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
	}
	public static void printNo(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
		}
	}
	
}
