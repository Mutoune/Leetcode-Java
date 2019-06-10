
public class Solution {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {
            val = x;
        }
    }
    public TreeNode createBST(int[] nums, int left, int right) {
        if (left > right) return null;
        TreeNode node = new TreeNode(nums[(right + left) / 2]);
        node.left = createBST(nums, left, (right + left) / 2 - 1);
        node.right = createBST(nums, (right + left) / 2 + 1, right);
        return node;
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0) return null;
        return createBST(nums, 0, nums.length - 1);
    }
    public static void main(String[] args) {
        
    }

}
