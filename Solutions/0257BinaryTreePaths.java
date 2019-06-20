import java.util.ArrayList;
import java.util.List;

public class Solution {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {
            val = x;
        }
    }
    public void dfs(TreeNode node, String str, List<String> list) {
        if (node.left == null && node.right == null) {
            list.add(str);
            return;
        }
        if (node.left != null) dfs(node.left, str + "->" + node.left.val, list);
        if (node.right != null) dfs(node.right, str + "->" + node.right.val, list);
    }
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList<>();
        if (root != null) dfs(root, String.valueOf(root.val), list);
        return list;
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}
