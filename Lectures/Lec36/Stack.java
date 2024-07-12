package Lec36;

public class Stack {
	private int[] arr;
	private int idx;
	public Stack() {
		arr = new int[5];
	}
	public void stack(int n) {
		arr = new int[n];
	}
	public boolean isEmpty() {
		return idx==0;
	}
	public int size() {
		return arr.length;
	}
	public int pop() throws Exception {
		if(isEmpty()) {
			throw new Exception("Jyada Dimag Mat Chala");
		}
		idx--;
		return arr[idx];
	}
	public void push(int item) throws Exception {
		if(isFull()) {
			throw new Exception("Bhai Stack bhar gya");			
		}
		arr[idx]=item;
		idx++;
	}
	public boolean isFull() {
		return idx==arr.length;
	}
	public int peek() {
		return arr[idx-1];
	}
	public void dikha() {
		for(int i=0;i<idx;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}