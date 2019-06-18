
public class Solution {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) return head;
        ListNode before = head;
        ListNode node = before.next;
        while (node != null) {
            if (node.val == val) {
                before.next = node.next;
            } else {
                before = node;
            }
            node = before.next;
        }
        return head.val == val ? head.next : head;
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}
