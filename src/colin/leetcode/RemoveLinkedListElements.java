package colin.leetcode;

/**
 * Remove all elements from a linked list of integers that have value val.
 * <p>
 * Example
 * Given: 1 --> 2 --> 6 --> 3 --> 4 --> 5 --> 6, val = 6
 * Return: 1 --> 2 --> 3 --> 4 --> 5
 * Created by Colin Wang on 2015-05-03.
 */
public class RemoveLinkedListElements {
	public ListNode removeElements(ListNode head, int val) {
		ListNode fakeHead = new ListNode(0);
		fakeHead.next = head;

		ListNode preNode = fakeHead;
		ListNode curNode = fakeHead.next;
		while (curNode != null) if (curNode.val == val) {
			preNode.next = curNode.next;
			curNode = curNode.next;
		} else {
			preNode = preNode.next;
			curNode = curNode.next;
		}
		return fakeHead.next;
	}

	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}
}
