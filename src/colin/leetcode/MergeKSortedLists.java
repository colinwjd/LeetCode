package colin.leetcode;

import java.util.List;
import java.util.PriorityQueue;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 *
 * @author ColinWang{wjdwjd@live.cn}
 * @date Feb 20, 2015
 */
public class MergeKSortedLists {
	
	public class ListNode {
		int val;
		ListNode next;
		ListNode(int x) {
			val = x;
			next = null;
		}
	}
	
	private PriorityQueue<Integer> pq;
	
	public ListNode mergeKLists(List<ListNode> lists) {
		pq = new PriorityQueue<>();
		for (ListNode listHead : lists) {
			while (listHead != null) {
				pq.add(listHead.val);
				listHead = listHead.next;
			}
		}
		
		ListNode first = null;
		ListNode end = null;
		while (!pq.isEmpty()) {
			ListNode min = new ListNode(pq.poll());
			if (first == null)
				first = end = min;
			else {
				end.next = min;
				end = min;
			}
		}
		return first;
	}
}
