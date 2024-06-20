package Lec37;

import java.util.Stack;

public class Construct_Smallest_Number_From_Di_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "IIIDIDDD";
		System.out.println(construct(str));
		

	}
	public static String construct(String str) {
		int[] ans = new int[str.length()+1];
		Stack<Integer> st = new Stack<>();
		int count = 1;
		for(int i=0;i<=str.length();i++){
			if(i==str.length() || str.charAt(i)=='I') {
				ans[i]=count;
				count++;
				while(!st.isEmpty()) {
					ans[st.pop()]=count;
					count++;
				}
			}
			else {
				st.push(i);
			}
			
		}
		String s = "";
		for(int i=0;i<ans.length;i++) {
			s+=ans[i];
		}
		return s;
	}

}
