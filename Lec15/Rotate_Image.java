package Lec15;

public class Rotate_Image {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][]arr= {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		rotate(arr);
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void rotate(int[][] arr) {
		Transpose(arr);
		for(int i=0;i<arr.length;i++) {
			for(int j=0,k=arr.length-1;j<arr[0].length/2;j++,k--) {
				int temp = arr[i][j];
				arr[i][j]=arr[i][k];
				arr[i][k]=temp;
			}
		}	
	}
	public static void Transpose(int[][] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				int temp=arr[j][i];
				arr[j][i]=arr[i][j];
				arr[i][j]=temp;
				
			}
		}
	}
}
