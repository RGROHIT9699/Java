package Lec22;

public class Array_First_Occurer {

	public static void main(String[] args) {
		int[] arr= {2,3,4,5,4,3,4,1};
		int item =3; 
		System.out.println(first(arr,item,0));

	}
	public static int first(int[] arr,int item,int n) {
		if(arr.length==n) {
			return -1;
		}
		if(arr[n]==item) {
			return n;
		}
		return first(arr,item,n+1);
	}

}

