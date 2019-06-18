
public class Solution {

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }
    private ListNode reverse(ListNode node) {
        ListNode prep = node.next;
        node.next = null;
        while (prep != null) {
            ListNode target = prep;
            prep = prep.next;
            target.next = node;
            node = target;
        }
        return node;
    }
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) return true;
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        if (fast != null) slow = slow.next;
        slow = reverse(slow);
        fast = head;
        while (slow != null) {
            if (fast.val != slow.val) return false;
            fast = fast.next;
            slow = slow.next;
        }
        return true;
    }
    public static void main(String[] args) {
        
    }

}
