package Lec41;

//import java.util.List;

//import Lec32.Merge_Sort;

public class Sort_List {
	public class ListNode {
	    int val;
	    ListNode next;
	   ListNode() {}
	    ListNode(int val) { this.val = val; }
	    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	}
	class Solution{
		public static ListNode sortList(ListNode head) {
			ListNode mid = middleNode(head);
			ListNode headB = mid.next;
			mid.next = null;
			ListNode A = sortList(head);//			return null;
			ListNode B = sortList(headB);
			return mergeTwoLists(A, B);
			
		}
	    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
	        ListNode l3 = null;
	        ListNode l1 = l3;
	        while(list1!=null && list2!=null){
	            if(list1.val < list2.val){
	                l3.next = list1;
	                l3 = l3.next;
	                list1 = list1.next;
	            }
	            else{
	                l3.next = list2;
	                l3 = l3.next;
	                list2 = list2.next;
	            }
	        }
	        if(list1 == null){
	            l3.next = list2;
	        }
	        if(list2 == null){
	            l3.next = list1;
	        }
	        return l1.next;
	    }
		public static ListNode middleNode(ListNode head) {
	        ListNode slow = head;
	        ListNode fast = head;
	            slow = slow.next;
	            fast = fast.next.next;
	        return slow;
	    }
	}

}
