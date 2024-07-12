package Lec38;

import java.util.Stack;

public class Histogram {

	public static void main(String[] args) {
//		int[] arr = {2,3,5,4,6,1,7};
		int[] arr = {1,1,1,1,8};
		System.out.println(areaRectangle(arr));
		
	}
	public static int areaRectangle(int[] arr) {
		Stack<Integer> st = new Stack<>();
		int ans = 0;
		for(int i=0;i<arr.length;i++) {
			while(!st.isEmpty() && arr[i]<arr[st.peek()]) {
				int h= arr[st.pop()];
				int r=i;
				if(!st.isEmpty()) {
					int l = st.peek();
					ans = Math.max(ans, h*(r-l-1));
				}
				else {
					ans = Math.max(ans, h*r);
				}
			}
			st.push(i);
		}
		int r=arr.length;
		while(!st.isEmpty()) {
			int h= arr[st.pop()];
			if(!st.isEmpty()) {
				int l = st.peek();
				ans = Math.max(ans, h*(r-l-1));
			}
			else {
				ans = Math.max(ans, h*r);
			}
		}
		return ans;
	}

}
