import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {
            val = x;
        }
    }
    private void check(List<TreeNode> list, TreeNode father, TreeNode node, Set<Integer> set) {
        if (node == null) return;
        if (!set.contains(node.val)) {
            if (father == null) {
                list.add(node);
            }
            check(list, node, node.left, set);
            check(list, node, node.right, set);
        }
        else {
            if (father != null) {
                if (father.left == node) {
                    father.left = null;
                }
                else {
                    father.right = null;
                }
            }
            check(list, null, node.left, set);
            check(list, null, node.right, set);
        }
    }
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        Set<Integer> set = new HashSet<>();
        for (Integer i : to_delete) {
            set.add(i);
        }
        List<TreeNode> list = new ArrayList<>();
        check(list, null, root, set);
        return list;
    }
    public static void main(String[] args) {
    }

}
