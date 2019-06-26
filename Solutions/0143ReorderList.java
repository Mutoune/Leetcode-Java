
public class Solution {

    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) return;
        ListNode slow = head, fast = slow;
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode prep = slow.next;
        ListNode node = prep.next;
        slow.next = null;
        prep.next = null;
        while (node != null) {
            ListNode temp = node.next;
            node.next = prep;
            prep = node;
            node = temp;
        }
        slow = head;
        fast = prep;
        while (fast != null) {
            ListNode tempS = slow.next;
            ListNode tempF = fast.next;
            slow.next = fast;
            fast.next = tempS;
            slow = tempS;
            fast = tempF;
        }
    }
    public static void main(String[] args) {
       ListNode node1 = new ListNode(1);
       ListNode node2 = new ListNode(2);
       ListNode node3 = new ListNode(3);
       ListNode node4 = new ListNode(4);
       ListNode node5 = new ListNode(5);
       node1.next = node2;
       node2.next = node3;
       node3.next = node4;
       node4.next = node5;
       new Solution().reorderList(node1);
    }

}
