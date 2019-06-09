import java.util.Stack;

public class Solution {

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        int index = 0;
        while (index < s.length()) {
            Character ch = s.charAt(index);
            switch (ch) {
                case '(':
                    stack.push(ch);
                    break;
                case '[':
                    stack.push(ch);
                    break;
                case '{':
                    stack.push(ch);
                    break;
                case ')':
                    if (stack.isEmpty() || stack.pop() != '(') return false;
                    break;
                case ']':
                    if (stack.isEmpty() || stack.pop() != '[') return false;
                    break;
                case '}':
                    if (stack.isEmpty() || stack.pop() != '{') return false;
                    break;
                default:
                    break;
            }
            index++;
        }
        return stack.isEmpty() ? true : false;
    }
    public static void main(String[] args) {
        System.out.println(new Solution().isValid("()[]{}"));
    }

}
