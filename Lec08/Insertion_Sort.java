package Lec08;

public class Insertion_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {2,4,5,7,3};
//		Inser_Element(arr,arr.length-1);
		Sort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void Sort(int arr[]) {
		for(int i=1;i<arr.length;i++) {
			Inser_Element(arr,i);
		}
	}
	public static void Inser_Element(int []arr,int i) {
		int j=i-1;
		int item=arr[i];
		while(j>=0&& arr[j]>item) {
			arr[j+1]=arr[j];
			j--;
		}
		arr[j+1]=item;
	}

}