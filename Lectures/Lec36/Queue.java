package Lec36;

public class Queue {
	private int[] arr;
	private int front;
	private int size;
	public Queue() {
		arr = new int[5];
	}
	public Queue(int n) {
		arr = new int[n];
	}
	public boolean isEmpty() {
		return size==0;
	}
	public boolean isFull() {
		return size==arr.length;
	}
	public int size() {
		return size;
	}
	public void enQueue(int item) throws Exception{
		if(isFull()) {
			throw new Exception("Queue bhar gya");
		}
		int idx = (front+size)%arr.length;
		arr[idx]=item;
		size++;
	}
	public int deQueue() {
		int item = arr[front];
		front= (front+1)%arr.length;
		size--;
		return item;
	}
	public int getFront() throws Exception {
		if(isEmpty()) {
			throw new Exception("queue toh khali hai :(");
		}
		int k = arr[front];
		return k;
	}
	public void display() {
		for(int i=0;i<size;i++) {
			int idx = (front+i)%arr.length;
			System.out.print(arr[idx]+" ");
		}
	}
}
