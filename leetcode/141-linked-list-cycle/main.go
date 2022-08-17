/**
 * Definition for singly-linked list.
 * type ListNode struct {
 *     Val int
 *     Next *ListNode
 * }
 */
func hasCycle(head *ListNode) bool {
	if (head == nil || head.Next == nil) {
		return false;
	}
	
	s := head;
 	f := head.Next;

	for (f != nil && f.Next != nil) {
		s = s.Next;
		f = f.Next.Next;
		
		if (s == f) {
			return true;
		}

	}
	
	return false;
    
}
