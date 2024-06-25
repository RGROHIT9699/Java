package Asgn7;

import java.util.*;
public class OddEven {
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
			nn.next = head;
			head = nn;
			size++;
		}
	}
	public void addLast(int item) {
		if(size==0) {
			addFirst(item);
		}
		else {
			Node nn = new Node();
			nn.val = item;
			tail.next = nn;
			tail = nn;
			size++;
		}
	}
	public void display() {
		Node temp = head;
		while(temp!=null) {
			System.out.print(temp.val+"-->");
			temp = temp.next;
		}
		System.out.println(".");
	}
	public static void main (String args[]) {
		Scanner qw = new Scanner(System.in);
		int qn = qw.nextInt();
		// int qm = qw.nextInt();
		OddEven lis1 = new OddEven();
		// Main lis2 = new Main();
		for(int k=0;k<qn;k++){
			lis1.addLast((qw.nextInt()));
		}
		// for(int k=0;k<qm;k++){
		// 	lis2.addLast((qw.nextInt()));
		// }
		Node res = oddEven(lis1.head);

		
		// Node h1 = reverse(lis1.head);
		// Node h2 = reverse(lis2.head);
		// Node res = addTwoNumbers(h1,h2);
		// res = reverse(res);
		while(res!=null){
			System.out.print(res.val+" ");
			res = res.next;
		}
		qw.close();		
    }
	public static Node oddEven(Node lis){
		Node even = new Node();
		Node odd = new Node();
		Node temp = even;
		// display(temp);
		Node tempo = odd;
		// display(tempo);
		while(lis!=null){
			if(lis.val%2==0){
				even.next = lis;
				even = even.next;
			}
			else{
				odd.next = lis;
				odd = odd.next;
			}
			lis = lis.next;
		}
		// temp=temp.next;
		// while(temp!=null){
		// 	System.out.print(temp.val+" ");
		// 	temp = temp.next;
		// }
		// while(temp!=null){
			odd.next = temp;
			// odd = odd.next;
			// temp=temp.next;
		// }
		return tempo.next;		
	}
	
}
class Node{
	public Node(int val, Node Next) {
		this.val = val;
		this.next = Next;
	}
	public Node(Node next){
		this.next = next;
	}

	public Node() {
	}
	public Node(int carry) {
		this.val = carry;
	}
	int val;
	Node next;
}
