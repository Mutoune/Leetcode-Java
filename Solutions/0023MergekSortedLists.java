import java.util.PriorityQueue;

public class Solution {

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> queue = new PriorityQueue<>((a, b) -> a.val - b.val);
        for (ListNode node : lists) {
            while (node != null) {
                queue.offer(node);
                node = node.next;
            }
        }
        ListNode head = queue.peek();
        while (!queue.isEmpty()) {
            queue.poll().next = queue.peek();
        }
        return head;
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}
