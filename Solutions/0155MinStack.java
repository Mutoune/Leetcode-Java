import java.util.ArrayList;
import java.util.List;

public class Solution {

    class MinStack {

        /** initialize your data structure here. */
        private List<Integer> list;
        private int min;
        public MinStack() {
            list = new ArrayList<>();
        }
        
        public void push(int x) {
            list.add(x);
        }
        
        public void pop() {
            list.remove(list.size() - 1);
        }
        
        public int top() {
            return list.get(list.size() - 1);
        }
        
        public int getMin() {
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < list.size(); i++) {
                if (min > list.get(i)) {
                    min = list.get(i);
                }
            }
            return min;
        }
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}
