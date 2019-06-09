import java.util.HashSet;
import java.util.Set;

public class Solution {

    static class ListNode {
         int val;
         ListNode next;
         ListNode(int x) { val = x; }
    }
    public ListNode deleteDuplicates(ListNode head) {
        Set<Integer> set = new HashSet<>();
        ListNode node = head;
        ListNode before = head;
        while (node != null) {
            if (set.contains(node.val)) {
                if (node.next != null) before.next = node.next;
                else before.next = null;
            } else {
                set.add(node.val);
                before = node;
            }
            node = before.next;
        }
        return head;
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(1);
        head.next = node1;
        node1.next = node2;
        System.out.println(new Solution().deleteDuplicates(head));
    }

}
