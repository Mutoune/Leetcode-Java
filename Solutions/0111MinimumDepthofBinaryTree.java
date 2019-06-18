import java.util.ArrayDeque;
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
    public int minDepth(TreeNode root) {
        if (root == null) return 0;
        Queue<TreeNode> queue = new ArrayDeque<>();
        int rtn = 0;
        queue.add(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if (node.left == null && node.left == null) return rtn;
                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
            }
            rtn++;
        }
        return rtn;
    }
    public static void main(String[] args) {

    }

}
