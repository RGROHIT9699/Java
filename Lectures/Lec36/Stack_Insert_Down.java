package Lec36;
import java.util.Stack;
public class Stack_Insert_Down {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> st = new Stack<>();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
//		st.push(10);
		System.out.println(st);
		insertEnd(st,-9);
		System.out.println(st);
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
