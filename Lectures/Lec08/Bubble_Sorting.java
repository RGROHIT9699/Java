package Lec08;

public class Bubble_Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {6,5,4,3,2};
		Sort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");	
		}
	}
	public static void Sort(int[] arr) {
		for(int i=0; i<arr.length-1;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				if (arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}

}
