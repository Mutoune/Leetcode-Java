import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution {

    static class Node {
        public int val;
        public List<Node> neighbors;

        public Node() {}

        public Node(int _val,List<Node> _neighbors) {
            val = _val;
            neighbors = _neighbors;
        }
    };
    public Node cloneGraph(Node node) {
        return cloneNode(node, new HashMap<>());
    }
    public Node cloneNode(Node node, HashMap<Integer, Node> map) {
        if (map.containsKey(node.val)) return map.get(node.val);
        Node clone = new Node(node.val, new ArrayList<>());
        map.put(node.val, clone);
        for (Node point : node.neighbors) {
                clone.neighbors.add(cloneNode(point, map));
        }
        return clone;
    }
    public static void main(String[] args) {
        Node node1 = new Node(1, new ArrayList<>());
        Node node2 = new Node(2, new ArrayList<>());
        Node node3 = new Node(3, new ArrayList<>());
        Node node4 = new Node(4, new ArrayList<>());
        node1.neighbors.add(node2);
        node1.neighbors.add(node4);
        node2.neighbors.add(node1);
        node2.neighbors.add(node3);
        node3.neighbors.add(node2);
        node2.neighbors.add(node4);
        node4.neighbors.add(node1);
        node2.neighbors.add(node3);
        System.out.println(node1);
//        System.out.println(new Solution().cloneGraph(node1).toString());
    }

}
