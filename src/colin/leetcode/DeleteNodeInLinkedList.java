package colin.leetcode;

/**
 * Write a function to delete a node (except the tail) in a singly linked list, given only access to that node.
 * Supposed the linked list is 1 -> 2 -> 3 -> 4 and you are given the third node with value 3,
 * the linked list should become 1 -> 2 -> 4 after calling your function.
 * Created by colin on 3/7/16.
 */
public class DeleteNodeInLinkedList {

    public void deleteNode(ListNode node) {
        ListNode nextNode = node.next;
        if (nextNode != null) {
            // 用下一个节点覆盖当前节点
            node.val = nextNode.val;
            node.next = nextNode.next;
        }
    }

    public static class ListNode {

        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }
}
