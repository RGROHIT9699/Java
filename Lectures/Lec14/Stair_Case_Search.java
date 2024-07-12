package Lec14;

public class Stair_Case_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr= {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
		int item= 6;
		System.out.println(search(arr, item));
		
	}
	public static boolean search(int[] [] arr,int item) {
		int c= arr[0].length-1;
		int r=0;
		while(c>=0 && r<arr.length) {
			if(arr[r][c]==item) {
				return true;
			}
			else if(arr[r][c]>item) {
				c--;
			}
			else {
				r++;
			}
		}
		return false;
	}

}
