package nov_2017;

public class ReverseNodesInKGroup {
	 public static ListNode reverseKGroup(ListNode head, int k) {
	 	if (head == null || head.next == null) 
            return head;
        ListNode curNode = head;
        int i = 0;
        while (i < k-1 && curNode != null){
            // If the number of nodes is not a multiple of k then left-out 
           i++;
           curNode = curNode.next; 
        }
        if (curNode ==null)
        	return head;
        
        // after get the first K nodes, recursively call the function for the next K nodes
        ListNode nxtHeadNode = curNode.next;
        ListNode tmpRetNode =  reverseKGroup(nxtHeadNode, k);
        // break the list
        curNode.next = null;
        ListNode retHead = reverseList(head);
        // connect with the return node from the recursive call
        head.next = tmpRetNode;
        return retHead;
	}
	    
    private static ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) 
            return head;
        ListNode preNode = null;
        ListNode nxtNode = null;
        ListNode curNode = head;
        while (curNode != null) {
            nxtNode = curNode.next;
            curNode.next = preNode;
            preNode = curNode;
            curNode = nxtNode;
        }
        return preNode;
    }
    
    public static void main(String[] args) {
    	ListNode n1 = new ListNode(1);
    	ListNode n2 = new ListNode(2);
    	ListNode n3 = new ListNode(3);
    	ListNode n4 = new ListNode(4);
    	ListNode n5 = new ListNode(5);
    	ListNode n6 = new ListNode(6);
    	n1.next = n2;
    	n2.next = n3;
    	n3.next = n4;
    	n4.next = n5;
    	n5.next = n6;
    	ListNode retNode = reverseKGroup(n1, 3);
    	while (retNode != null) {
			System.out.print(retNode.val + "-");
			retNode = retNode.next;
		}
    }
}
