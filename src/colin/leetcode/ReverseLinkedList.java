package colin.leetcode;

/**
 * Reverse a singly linked list.Hint:
 * A linked list can be reversed either iteratively or recursively. Could you implement both?
 * Created by Colin Wang on 2015-05-09.
 */
public class ReverseLinkedList {
	public ListNode reverseList(ListNode head) {
		if (head == null)
			return null;
		if (head.next == null)
			return head;
		ListNode pre = null;
		ListNode cur = head;
		ListNode next = head.next;
		while (next != null) {
			cur.next = pre;
			pre = cur;
			cur = next;
			next = next.next;
		}
		cur.next = pre;
		return cur;
	}

	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}
}
