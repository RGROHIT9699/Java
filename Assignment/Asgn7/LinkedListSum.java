package Asgn7;
import java.util.*;
class Node{
	public Node(int val, Node Next) {
		this.val = val;
		this.next = Next;
	}
	public Node(Node next){
		this.next = next;
	}

	public Node() {
		//TODO Auto-generated constructor stub
	}
	public Node(int carry) {
		this.val = carry;
		//TODO Auto-generated constructor stub
	}
	int val;
	Node next;
}
public class LinkedListSum {
	
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
		int qm = qw.nextInt();
		LinkedListSum lis1 = new LinkedListSum();
		LinkedListSum lis2 = new LinkedListSum();
		for(int k=0;k<qn;k++){
			lis1.addLast((qw.nextInt()));
		}
		for(int k=0;k<qm;k++){
			lis2.addLast((qw.nextInt()));
		}

		
		Node h1 = reverse(lis1.head);
		Node h2 = reverse(lis2.head);
		Node res = addTwoNumbers(h1,h2);
		while(res!=null){
			System.out.print(res.val+" ");
			res = res.next;
		}
		qw.close();

		
    }
	public static Node addTwoNumbers(Node l1, Node l2) {
        Node head1 = new Node();
        Node curr = head1;
        int sum = 0;
        int carry=0;
        if(l1.val==0 && l1.next==null) return l2;
        if(l2.val==0 && l2.next==null) return l1;
        while(l1!=null && l2!=null){
            sum = l1.val+l2.val + carry;
            carry = sum/10;
            sum = sum%10;
            l1 = l1.next;
            l2 = l2.next;
            curr.val = sum;
            if(!(l1==null && l2==null)){
                curr.next = new Node();
                curr = curr.next;
            }
        }
        while(l2!=null){
            sum = l2.val+carry;
            carry = sum/10;
            sum =sum % 10;
            l2=l2.next;
            curr.val = sum;
            if(l2!=null){
                curr.next = new Node();
                curr = curr.next; 
            }
        }
        while(l1!=null){
            sum = l1.val+carry;
            carry = sum/10;
            sum =sum % 10;
            l1 = l1.next;
            curr.val = sum;
            if(l1!=null){
                curr.next = new Node();
                curr = curr.next; 
            }
        }
        if(carry>0){
            curr.next = new Node(carry);
        }
        return head1;
    }
	public static Node reverse(Node l1){
		Node prev = null;
        Node curr = l1;
        while (curr != null) {
            Node ahead = curr.next;
            curr.next = prev;
            prev = curr;
            curr = ahead;
        }
        return prev;
	}
}