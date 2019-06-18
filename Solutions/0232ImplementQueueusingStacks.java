import java.util.Stack;

public class Solution {

    class MyQueue {

        /** Initialize your data structure here. */
        private Stack<Integer> queue;
        public MyQueue() {
            queue = new Stack<>();
        }
        
        /** Push element x to the back of queue. */
        public void push(int x) {
            queue.push(x);
        }
        
        /** Removes the element from in front of queue and returns that element. */
        public int pop() {
            int temp = queue.get(0);
            queue.remove(0);
            return temp;
        }
        
        /** Get the front element. */
        public int peek() {
            return queue.get(0);
        }
        
        /** Returns whether the queue is empty. */
        public boolean empty() {
            return queue.isEmpty();
        }
    }
    public static void main(String[] args) {

    }

}
