package Lec07;
import java.util.*;

public class Linear_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner qw = new Scanner(System.in);
		int qwe= qw.nextInt();
		int[] arr = new int[qwe];
		for(int i=0;i<qwe;i++) {
			arr[i]=qw.nextInt();
		}
		int item=qw.nextInt();
		System.out.println(searchNo(arr,item));
		qw.close();
		
	}
	public static int searchNo(int[]arr,int item) {
		for(int i=0;i<arr.length;i++) {
			if (arr[i]==item) {
				return i+1;
			}
		}
		return -1;
	}

}
