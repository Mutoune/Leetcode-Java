import java.util.PriorityQueue;

public class Solution {

    public int lastStoneWeight(int[] stones) {
        if (stones.length == 0) return 0;
        PriorityQueue<Integer> queue = new PriorityQueue<>((a, b) -> b - a);
        for (int i = 0; i< stones.length; i++) queue.add(stones[i]);
        while (queue.size() > 1) {
            int a = queue.poll();
            int b = queue.poll();
            if (a > b) queue.add(a - b);
            else if (queue.size() == 0) return 0;
        }
        return queue.poll();
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}
