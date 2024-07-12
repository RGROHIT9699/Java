package Lec21;
import java.util.*;

public class Diagonal_Traversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
		int[]arr1= diagonal(arr);
		for(int i=0;i<arr1.length;i++) {
			System.out.print(arr1[i]+" ");
		}

	}
	public static int[] diagonal(int[][] arr) {
		int n = arr.length;
		int m = arr[0].length;
		int[] ans= new int[m*n];
		int i=0;
		for(int d=0;d< n+m-1;d++) {
			int r=0,c=0;
			if(d<m) {
				c= d;
			} else {
				c= m-1;
				r= d-m +1;
			}
			ArrayList<Integer> ll = new ArrayList<>(); 
			while(r<n && c>=0) {
//				System.out.print(arr[r][c]+ "");
				ll.add(arr[r][c]);
				r++;
				c--;
			}
			if( d%2 == 0) {
				Collections.reverse(ll);
			}
//			System.out.println(ll);
			for(int ii=0;ii<ll.size();ii++) {
				ans[i]=ll.get(ii);
				i++;
			}
		}
		return ans;
	}

}
