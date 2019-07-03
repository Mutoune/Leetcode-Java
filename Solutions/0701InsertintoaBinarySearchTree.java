
public class Solution {

    static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int x) {
            val = x;
        }
    }
    public TreeNode insertIntoBST(TreeNode root, int val) {
        TreeNode father = root;
        TreeNode node = root;
        while (node != null) {
            father = node;
            if (val < node.val) node = node.left;
            else node = node.right;
        }
        TreeNode newNode = new TreeNode(val);
        if (val < father.val) father.left = newNode;
        else father.right = newNode;
        return root;
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}
