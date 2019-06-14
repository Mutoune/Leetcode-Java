import java.util.Stack;

public class Solution {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode reverseList(ListNode head) {
        if (head == null) return null;
        Stack<ListNode> stack = new Stack<>();
        stack.add(head);
        while (stack.peek().next != null) {
            stack.push(stack.peek().next);
        }
        ListNode node = stack.peek();
        while (stack.size() > 1) {
            stack.pop().next = stack.peek();
        }
        stack.peek().next = null;
        return node;
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}
