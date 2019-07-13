import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    static class TreeNode{
        int val;
        TreeNode left, right;
        TreeNode(int x) {
            val = x;
        }
    }
    Map<TreeNode, List<Integer>> map = new HashMap<>();
    double max = Double.MIN_VALUE;
    private void dfs(TreeNode node) {
        List<Integer> list = new ArrayList<>();
        list.add(node.val);
        list.add(1);
        if (node.left != null) {
            dfs(node.left);
            list.set(0, list.get(0) + map.get(node.left).get(0));
            list.set(1, list.get(1) + map.get(node.left).get(1));
        }
        if (node.right != null) {
            dfs(node.right);
            list.set(0, list.get(0) + map.get(node.right).get(0));
            list.set(1, list.get(1) + map.get(node.right).get(1));
        }
        max = Math.max(max, (double)list.get(0) / list.get(1)); 
        map.put(node, list);
    }
    public double maximumAverageSubtree(TreeNode root) {
        if (root == null) return 0;
        dfs(root);
        return max;
    }
    public static void main(String[] args) {

    }

}
