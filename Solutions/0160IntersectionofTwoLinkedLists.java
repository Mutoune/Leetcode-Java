import java.util.Stack;

public class Solution {

    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode node = head.next;
        ListNode newHead = reverseList(node);
        node.next = head;
        head.next = null;
        return newHead;
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;
        headA = reverseList(headA);
        headB = reverseList(headB);
        ListNode nodeA = reverseList(headA);
        ListNode nodeB = reverseList(headB);
        while (nodeA.next != null && nodeB.next != null && nodeA == nodeB) {
            nodeA = nodeA.next;
            nodeB = nodeB.next;
        }
        if (nodeA == nodeB) return nodeA;
        else if (nodeA.next == nodeB.next) return nodeA.next;
        else return null;
//        if (headA == headB) return headA;
//        if (headA == null || headB == null) return null;
//        Stack<ListNode> stacka = new Stack<>();
//        Stack<ListNode> stackb = new Stack<>();
//        stacka.push(headA);
//        while (stacka.peek().next != null) stacka.push(stacka.peek().next);
//        stackb.push(headB);
//        while (stackb.peek().next != null) stackb.push(stackb.peek().next);
//        while (stacka.peek() != headA && stackb.peek() != headB && stacka.peek() == stackb.peek()) {
//            stacka.pop();
//            stackb.pop();
//        }
//        if (stacka.peek().next == stackb.peek().next) return stacka.peek().next;
//        return null;
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}
