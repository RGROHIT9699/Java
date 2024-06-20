package Lec08;

public class Selection_Sort {

	public static void main(String[] args) {
		int []arr= {1,4,5,2,7,3};
        Sort(arr);
        for(int i=0;i<arr.length;i++) {
        	System.out.print(arr[i]+" ");
        }
}
	public static void Sort(int[]arr) {
		for(int i=0;i<arr.length;i++) {
			int idx=Min_value_index(arr,i);
			int temp=arr[i];
			arr[i]=arr[idx];
			arr[idx]=temp;
		}
	}
	public static int Min_value_index(int arr[],int i) {
		int mini=i;
		for(int j=i+1;j<arr.length;j++) {
			if(arr[j]<arr[mini]) {
				mini=j;
			}
		}
		return mini;
	}
}