import java.util.ArrayList;
import java.util.List;

public class Solution {

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        List<ListNode> list = new ArrayList<>();
        ListNode node = head;
        while (node != null) {
            list.add(node);
            node = node.next;
        }
        if (list.size() - n - 1 >= 0) 
            list.get(list.size() - n - 1).next = list.get(list.size() - n).next;
        else return head.next;
        return head;
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}
