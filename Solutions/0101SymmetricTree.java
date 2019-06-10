
public class Solution {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {
            val = x;
        }
    }
    public boolean isSym(TreeNode lch, TreeNode rch) {
        if (lch == null || rch == null) {
            return lch == rch;
        }
        if (lch.val != rch.val) {
            return false;
        }
        return isSym(lch.left, rch.right) && isSym(lch.right, rch.left);
    }
    public boolean isSymmetric(TreeNode root) {
        return root == null || isSym(root.left, root.right);
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
        node2.right = node5;
        node3.left = node6;
        node3.right = node7;
        System.out.println(new Solution().isSymmetric(node1));
    }

}
