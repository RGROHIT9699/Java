package Lec41;

//import Lec39.LinkedList.Node;

public class Cycle_List {
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
	public void createCycle() throws Exception {
		Node nn= getNode(2);
		tail.Next = nn;
	}
	public Node hasCycle(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.Next != null) {
            slow = slow.Next;
            fast = fast.Next.Next;
            if(slow==fast){
                return slow;
            }
        }
        return null;
    }
	public void removeCycle() {
		Node meet = hasCycle(head);
		if(meet== null) {
			return;
		}
		Node start = head;
		while(start!=null) {
			Node temp= meet;
			while(temp.Next!=meet) {
				if(temp.Next==start) {
					temp.Next = null;
					return;
				}
				temp = temp.Next;
			}
			start = start.Next;
		}
	}
	public void floyedCycle() {
		Node meet = hasCycle(head);
		if(meet== null) {
			return;
		}
		Node fast = meet;
		Node slow = head;
		while(slow.Next!= fast.Next) {
			slow=slow.Next;
			fast = fast.Next;
		}
		fast.Next = null;
		
	}
	public void removeCycle1() {
		Node meet = hasCycle(head);
		if(meet== null) {
			return;
		}
		int c = 1;
		Node temp = meet ;
		while(temp.Next != meet) {
			c++;
			temp=temp.Next;
		}
		Node fast = head;
		for (int i = 0; i < c; i++) {
			fast = fast.Next;
		}
		Node slow = head;
		while(slow.Next!=fast.Next) {
			slow =slow.Next;
			fast= fast.Next;
		}
		fast.Next = null;
	}
	public static void main(String[] args) throws Exception{
		Cycle_List  cl = new Cycle_List();
		cl.addLast(10);
		cl.addLast(20);
		cl.addLast(30);
		cl.addLast(40);
		cl.addLast(50);
		cl.addLast(60);
		cl.addLast(70);
		cl.addLast(80);
//		cl.addLast(10);
		cl.createCycle();
		cl.display();
	}
}