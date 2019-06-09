import java.util.ArrayList;
import java.util.List;

public class Solution {

    static class ListNode {
         int val;
         ListNode next;
         ListNode(int x) { val = x; }
     }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        List<ListNode> list = new ArrayList<>();
        int temp = 0;
        ListNode num1 = l1;
        ListNode num2 = l2;
        while (num1 != null || num2 != null) {
            ListNode node = new ListNode(0);
            int int1 = 0;
            int int2 = 0;
            if (num1 != null) {
                int1 = num1.val;
                num1 = num1.next;
            }
            if (num2 != null) {
                int2 = num2.val;
                num2 = num2.next;
            }
            node.val = int1 + int2 + temp;
            temp = node.val / 10;
            node.val = node.val % 10;
            list.add(node);
        }
        if (temp == 1) {
            ListNode node = new ListNode(1);
            list.add(node);
        }
        for (int i = 0; i < list.size() - 1; i++) {
            list.get(i).next = list.get(i + 1);
        }
        return list.get(0);
    }
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(8);
        l1.next = l2;
        ListNode l3 = new ListNode(0);
        System.out.println(new Solution().addTwoNumbers(l1, l3).toString());
    }

}
