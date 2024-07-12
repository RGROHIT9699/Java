package Lec07;

public class ReverseNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,12,3,5,6,7,8,9,4,11,16,25};
		int i=2,j=7;
		reverseN(arr,i,j);
		printNo(arr);

	}
	
	public static void reverseN(int[] arr,int i,int j) {
		while(i<j) {
			int temp = arr[i];
			arr[i]= arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
	}
	public static void printNo(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
