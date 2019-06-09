import java.util.ArrayList;
import java.util.List;
//import java.util.Stack;

public class Solution {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
//    public List<Integer> inorderTraversal(TreeNode root) {
//        List<Integer> rtn = new ArrayList<>();
//        if (root == null) return rtn;
//        Stack<TreeNode> nodeList = new Stack<>();
//        nodeList.add(root);
//        while (nodeList.size() > 0) {
//            TreeNode node = nodeList.peek();
//            if (node.left == null) {
//                rtn.add(node.val);
//                nodeList.pop();
//                if (node.right != null) nodeList.push(node.right);
//            } else {
//                nodeList.push(node.left);
//                node.left = null;
//            }
//        }
//        return rtn;
//    }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> rtn = new ArrayList<>();
        if (root == null) return rtn;
        List<TreeNode> nodeList = new ArrayList<>();
        nodeList.add(root);
        while (nodeList.size() > 0) {
            TreeNode node = nodeList.get(nodeList.size() - 1);
            if (node.left == null) {
                rtn.add(node.val);
                nodeList.remove(nodeList.size() - 1);
                if (node.right != null) nodeList.add(node.right);
            } else {
                nodeList.add(node.left);
                node.left = null;
            }
        }
        return rtn;
    }

    public static void main(String[] args) {
        TreeNode node3 = new TreeNode(3);
        TreeNode node2 = new TreeNode(2);
        TreeNode node1 = new TreeNode(1);
        node1.right = node2;
        node2.left = node3;

        System.out.println(new Solution().inorderTraversal(node1));

    }

}
