import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Solution {

    public int[][] insert(int[][] intervals, int[] newInterval) {
        if (intervals.length == 0) return new int[][] {newInterval};
        PriorityQueue<int[]> queue = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        queue.add(newInterval);
        for (int[] i : intervals) queue.add(i);
        List<int[]> lists = new ArrayList<>();
        int[] list = new int[2];
        list[0] = queue.peek()[0];
        list[1] = queue.poll()[1];
        while (!queue.isEmpty()) {
            if (queue.peek()[0] <= list[1]) {
                list[1] = Math.max(list[1], queue.poll()[1]);
            } else {
                lists.add(list);
                list = new int[2];
                list[0] = queue.peek()[0];
                list[1] = queue.poll()[1];
            }
        }
        lists.add(list);
        int[][] rtn = new int[lists.size()][];
        for (int i = 0; i < lists.size(); i++) {
            rtn[i] = lists.get(i);
        }
        return rtn;
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}
