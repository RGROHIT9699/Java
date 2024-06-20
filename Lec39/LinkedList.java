package Lec39;
public class LinkedList {
	class Node{
		int val;
		Node Next;
	}
	private Node head;
	private Node tail;
	private int size;
	public void addFirst(int item) {
		Node nn = new Node();
		nn.val = item;
		if(size==0) {
			head = nn;
			tail = nn;
			size++;
		}
		else {
			nn.Next = head;
			head = nn;
			size++;
		}
	}
	public void display() {
		Node temp = head;
//		int count =0;
		while(temp!=null) {
//			if(count>1) {
//				System.out.print();
//			}
			System.out.print(temp.val+"-->");
			temp = temp.Next;
//			count++;
		}
		System.out.println(".");
	}
	public void addLast(int item) {
		if(size==0) {
			addFirst(item);
		}
		else {
			Node nn = new Node();
			nn.val = item;
			tail.Next = nn;
			tail = nn;
			size++;
		}
	}
	public void addAtIndex(int k,int item) throws Exception {
		if(k==0) {
			addFirst(item);
		}
		else if (k==size) {
			addLast(item);
		}
		else {
			Node nn = new Node();
			nn.val = item;
			Node k1 = getNode(k-1);
			nn.Next = k1.Next;
			k1.Next = nn;
			size++;
			
		}
		
	}
	public Node getNode(int k) throws Exception{
		if(k<0 || k>=size) {
			throw new Exception("Out of Range");
		}
		Node temp = head;
		for(int i=0;i<k;i++) {
			temp = temp.Next;
		}
		return temp;
	}
	public int getFirst() {
		return head.val;
	}
	public int getLast() {
		return tail.val;
	}
	public int getAtIndex(int k) throws Exception{
		return getNode(k-1).val;
	}
	public int removeFirst() {
		Node temp = head;
		if(size==1) {
			head = null;
			tail = null;
			size--;
		}
		else {
			head = head.Next;
			temp.Next= null;
			size--;
		}
		return temp.val;
	}
	public int removeLast() throws Exception {
		if(size==1) {
			return removeFirst();
		}
		else {
			Node prev = getNode(size-2);
			int rv = tail.val;
			tail = prev;
			tail.Next = null;
			size--;
			return rv;
		}
	}
	public int removeAtIndex(int k) throws Exception{
		if(k==0) {
			return removeFirst();
		}
		else if(k==size-1) {
			return removeLast();
		}
		else {
			Node prev = getNode(k-1);
			Node curr = getNode(k);
			prev.Next = curr.Next;
			curr.Next = null;
			return prev.val;
		}
	}
}