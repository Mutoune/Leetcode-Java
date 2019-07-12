import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {

    static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int x) {
            val = x;
        }
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> lists = new LinkedList<>();
        if (root == null) return lists;
        queue.add(root);
        while (!queue.isEmpty()) {
            List<Integer> list = new LinkedList<>();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                list.add(queue.peek().val);
                if (queue.peek().left != null) {
                    queue.add(queue.peek().left);
                }
                if (queue.peek().right != null) {
                    queue.add(queue.peek().right);
                }
                queue.poll();
            }
            lists.add(list);
        }
        return lists;
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}
