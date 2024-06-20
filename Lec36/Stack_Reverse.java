package Lec36;
import java.util.Stack;
public class Stack_Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> st = new Stack<>();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		System.out.println(st);
		reverseStack(st);
		System.out.println(st);
	}
	public static void reverseStack(Stack<Integer> st) {
		if(st.isEmpty()) {
			return;
		}
		int s = st.pop();
		reverseStack(st);
		insertEnd(st, s);

	}
	public static void insertEnd(Stack<Integer> st,int num) {
		if(st.size()==0) {
			st.push(num);
			return;
		}
		int k = st.pop();
		insertEnd(st, num);
		st.push(k);
	}

}
