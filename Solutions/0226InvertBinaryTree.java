import java.util.ArrayDeque;
import java.util.Queue;

public class Solution {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {
            val = x;
        }
    }
    public TreeNode invertTree(TreeNode root) {
        if (root == null) return root;
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode temp = queue.peek().left;
            queue.peek().left = queue.peek().right;
            queue.peek().right = temp;
            if (queue.peek().left != null) queue.add(queue.peek().left);
            if (queue.peek().right != null) queue.add(queue.peek().right);
            queue.poll();
        }
        return root;
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}
