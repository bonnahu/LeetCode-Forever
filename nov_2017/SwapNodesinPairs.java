package nov_2017;
/**
 * Given a linked list, swap every two adjacent nodes and return its head.

For example,
Given 1->2->3->4, you should return the list as 2->1->4->3.

Your algorithm should use only constant space. You may not modify the values in the list, only nodes itself can be changed.


 * @author Lei
 *
 */
public class SwapNodesinPairs {
	public static ListNode swapPairs(ListNode head) {
		// base case
		if (head == null || head.next == null)
			return head;
		ListNode nxtRetNode =  swapPairs(head.next.next);
		// switch the current first two nodes
		ListNode firstNode = head;
		ListNode secNode = head.next;
		secNode.next =  firstNode;
		firstNode.next  = nxtRetNode;
		return secNode;
	}
	
	public static void main(String[] args) {
		ListNode n1 = new ListNode(1);
		//ListNode n2 = new ListNode(2);
		/*ListNode n3 = new ListNode(3);
		ListNode n4 = new ListNode(4);*/
		//n1.next = n2;
		/*n2.next = n3;
		n3.next = n4;
		*/
		ListNode retNode = swapPairs(n1);
		while (retNode != null) {
			System.out.print(retNode.val + "-");
			retNode = retNode.next;
		}
	}
}
