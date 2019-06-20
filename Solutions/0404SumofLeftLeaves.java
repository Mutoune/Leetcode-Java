import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {
            val = x;
        }
    }

    public int sumOfLeftLeaves(TreeNode root) {
        int sum = 0;
        Queue<TreeNode> queue = new LinkedList<>();
        if (root == null) return sum;
        queue.add(root);
        while (!queue.isEmpty()) {
            if (queue.peek().left != null) {
                if (queue.peek().left.left == null && queue.peek().left.right == null)
                    sum += queue.peek().left.val;
                else queue.add(queue.peek().left);
            }
            if (queue.peek().right != null) queue.add(queue.peek().right);
            queue.poll();
        }
        return sum;
    }

    public static void main(String[] args) {
    }

}
