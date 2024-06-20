package Lec38;

import java.util.*;

public class Stock_Span {

	public static void main(String args[])  {
		Scanner qw = new Scanner(System.in);
		int len = qw.nextInt();
		int[] arr = new int[len];
		for(int i=0;i<len;i++){
			arr[i]=qw.nextInt();
		}   
		int ans[] = new int[len];
		Stack<Integer> st = new Stack<>();
		for(int i=0;i<len;i++){
			while(!st.isEmpty() && arr[i]>=arr[st.peek()]){
				st.pop();
			}
			if(st.isEmpty()){
				ans[i] = i+1;
			}
			else{
				ans[i] = i-st.peek();
			}
			st.push(i);
		}
		for(int i=0;i<len;i++){
			System.out.print(ans[i]+" ");
		}
		System.out.print("END");
		qw.close();
	}
}