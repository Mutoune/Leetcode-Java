import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
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
    
    public boolean isSymmetric(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int empty = 0;
        while (empty != queue.size()) {
            TreeNode node = queue.poll();
            if (node == null) {
                empty--;
                list.add(null);
                if (empty != queue.size()) {
                    queue.add(null);
                    queue.add(null);
                    empty = empty + 2;
                }
            } else {
                list.add(node.val);
                queue.add(node.left);
                if (node.left == null) empty++;
                queue.add(node.right);
                if (node.right == null) empty++;
            }
        }
        int len = 1;
        int index = 0;
        while (index < list.size()) {
            for (int i = 0; i <= len / 2; i++) {
                if (list.get(index + i) != list.get(index + len - i - 1)) {
                    return false;
                }
            }
            index = index + len;
            len = len * 2;
        }
        return true;
    }
    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(2);
        TreeNode node4 = new TreeNode(2);
        TreeNode node5 = new TreeNode(4);
        TreeNode node6 = new TreeNode(2);
        TreeNode node7 = new TreeNode(3);
        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
//        node2.right = node5;
        node3.left = node6;
//        node3.right = node7;
        System.out.println(new Solution().isSymmetric(node1));
    }

}
