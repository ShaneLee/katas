import java.util.Comparator;
import java.util.PriorityQueue;

class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode node = null;
		final PriorityQueue<Integer> q = new PriorityQueue<>(Comparator.reverseOrder());

		for (ListNode l : lists) {
            node = l;
			while (node != null) {
				q.add(node.val);
				node = node.next;
			}
		}

	    var val = q.poll(); 	

        while (val != null) {
            node = new ListNode(val, node);
            val = q.poll();
        }
		
        return node;
        
    }
}
