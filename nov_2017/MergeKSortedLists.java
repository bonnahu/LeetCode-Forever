package nov_2017;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Merge k sorted linked lists and return it as one sorted list. 
 * Analyze and describe its complexity.
 * 
 * @author Lei
 *
 */
class ListNode {
	int val;
	ListNode next;
	ListNode(int x) { val = x; }
}
class NodeComparator implements Comparator<ListNode> {
	@Override
	public int compare(ListNode node0, ListNode node1) {
		// TODO Auto-generated method stub
		if (node0.val < node1.val)
			return 0;
		else
			return 1;
	}
	
}
public class MergeKSortedLists {
	public ListNode mergeKLists(ListNode[] lists) {
        //initial check
		if (lists==null || lists.length==0) return null;
		PriorityQueue <ListNode> pqListNode= new PriorityQueue<>(new NodeComparator());
		// add first node of in the lists to the queue
		for(ListNode node : lists) {
			pqListNode.add(node);
		}
		// always use a sentinel node
		ListNode senNode= new ListNode(Integer.MIN_VALUE);
		// the node we use to construct the sorted list
		ListNode curNode=senNode;
		ListNode smallestNode;
		while (!pqListNode.isEmpty()) {
			smallestNode=pqListNode.poll();
			if (smallestNode.next!=null)
				pqListNode.add(smallestNode.next);
			//add the smallestNode to the newly sorted list
			curNode.next=smallestNode;
			curNode=curNode.next;
		}
		return senNode.next;
    }
	
	public static void main(String[] args) {
		
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);
		ListNode node4 = new ListNode(4);
		ListNode node5 = new ListNode(5);
		ListNode node6 = new ListNode(6);
		ListNode node7 = new ListNode(7);
		ListNode node8 = new ListNode(8);
		ListNode node9 = new ListNode(9);
		ListNode node10 = new ListNode(10);
		ListNode node11 = new ListNode(11);
		//list1
		node1.next= node3;
		node3.next= node5;
		
	}
}
