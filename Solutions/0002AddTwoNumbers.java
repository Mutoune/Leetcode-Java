
public class Solution {

    static class ListNode {
         int val;
         ListNode next;
         ListNode(int x) { val = x; }
     }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode rtn = new ListNode(0);
        int temp = 0;
        ListNode num1 = l1;
        ListNode num2 = l2;
        ListNode node = rtn;
        while (num1 != null || num2 != null) {
            node.next = new ListNode(0);
            node = node.next;
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
        }
        if (temp == 1) {
            node.next = new ListNode(1);
        }
        return rtn.next;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(8);
        l1.next = l2;
        ListNode l3 = new ListNode(0);
        System.out.println(new Solution().addTwoNumbers(l1, l3).toString());
    }

}
