import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {

    class Node {
        public int val;
        public List<Node> children;
        
        public Node() {};
        
        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }
    public List<List<Integer>> levelOrder(Node root) {
        Queue<Node> queue = new LinkedList<>();
        List<List<Integer>> lists = new ArrayList<>();
        if (root == null) return lists;
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                list.add(queue.peek().val);
                for (Node node : queue.poll().children) {
                    queue.offer(node);
                }
            }
            lists.add(list);
        }
        return lists;
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}
