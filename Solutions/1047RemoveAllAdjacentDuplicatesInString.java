import java.util.Stack;

public class Solution {

    public String removeDuplicates(String S) {
        Stack<Character> stack = new Stack<>();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < S.length(); i++) {
            if (!stack.isEmpty() && stack.peek() == S.charAt(i)) stack.pop();
            else stack.push(S.charAt(i));
        }
        while (!stack.isEmpty()) sb.append(stack.pop());
        return sb.reverse().toString();
    }
    public static void main(String[] args) {
        System.out.println(new Solution().removeDuplicates("baabac"));
    }

}
