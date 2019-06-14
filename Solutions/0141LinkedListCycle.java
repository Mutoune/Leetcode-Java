
public class Solution {

    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    public boolean hasCycle(ListNode head) {
        ListNode node = head;
        while (node != null && node.next != null) {
            if (node.next.next == head) return true;
            ListNode temp = node.next;
            node.next = head;
            node = temp;
        }
        return false;
    }
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        node1.next = node2;
        System.out.println(new Solution().hasCycle(node1));
    }

}
