
public class Solution {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }
    public ListNode swapPairs(ListNode head) {
        ListNode node = head;
        ListNode before = head;
        while (node != null && node.next != null) {
            ListNode nextNode = node.next;
            node.next = nextNode.next;
            nextNode.next = node;
            if (node == head) head = nextNode;
            else before.next = nextNode;
            before = node;
            node = node.next;
        }
        return head;
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}
