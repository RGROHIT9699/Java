package Lec10;

public class Binary_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5,6,7,8,9,10,11};
		int item=7;
		System.out.println(Search(arr, item));
		

	}
	public static int Search(int[] arr,int item) {
		int l=arr.length-1;
		int f=0;
		while(f<=l) {
			int mid = (l+f)/2;
			if(arr[mid]==item) {
				return mid;
			}
			else if(arr[mid]>item) {
				l=mid-1;
			}
			else {
				f=mid+1;
			}
		}
		return -1;
	}

}
