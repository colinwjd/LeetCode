package colin.leetcode;

/**
 * You are given two linked lists representing two non-negative numbers. The
 * digits are stored in reverse order and each of their nodes contain a single
 * digit. Add the two numbers and return it as a linked list.
 * 
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4) Output: 7 -> 0 -> 8
 * 
 * @author Colin Wang Created on Apr 26, 2015
 */
public class AddTwoNumbers {

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		int sum = 0;
		int carry = 0;
		// 头结点
		ListNode head = new ListNode(0);
		// 当前结点
		ListNode tail = head;
		// l1与l2同时为null时退出循环
		while (l1 != null || l2 != null) {
			if (l1 == null) {
				sum = l2.val;
				l2 = l2.next;
			} else if (l2 == null) {
				sum = l1.val;
				l1 = l1.next;
			} else {
				// l1 != null && l2 != null
				sum = l1.val + l2.val;
				l1 = l1.next;
				l2 = l2.next;
			}
			// sum加上进位
			sum += carry;
			if (sum >= 10) {
				// 如果sum大于10，继续向前进位
				sum = sum - 10;
				carry = 1;
			} else {
				carry = 0;
			}
			tail.next = new ListNode(sum);
			tail = tail.next;
		}
		if (carry == 1) {
			tail.next = new ListNode(carry);
		}
		return head.next;
	}

	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}
}
