import java.util.Stack;

public class Solution {

    private void doWith(Character ex, Stack<Character> stack) {
        switch (ex) {
        case '!':
            if (stack.pop() == 'f') {
                stack.pop();
                stack.push('t');
            } else {
                stack.pop();
                stack.push('f');
            }
            break;
        case '&':
            boolean res = stack.pop() == 'f' ? false : true;;
            while (stack.peek() != '(') {
                boolean flg = stack.pop() == 'f' ? false : true;
                res = res && flg;
            }
            stack.pop();
            if (res) stack.push('t');
            else stack.push('f');
            break;
        case '|':
            res = stack.pop() == 'f' ? false : true;;
            while (stack.peek() != '(') {
                boolean flg = stack.pop() == 'f' ? false : true;
                res = res || flg;
            }
            stack.pop();
            if (res) stack.push('t');
            else stack.push('f');
            break;
        }
    }
    public boolean parseBoolExpr(String exp) {
        Stack<Character> exstack = new Stack<>();
        Stack<Character> tarstack = new Stack<>();
        for (int i = 0; i < exp.length(); i++) {
            switch (exp.charAt(i)) {
            case '!':
                exstack.push('!');
                break;
            case '&':
                exstack.push('&');
                break;
            case '|':
                exstack.push('|');
                break;
            case ',':
                break;
            case '(':
                tarstack.push('(');
                break;
            case ')':
                doWith(exstack.pop(), tarstack);
                break;
            default:
                tarstack.push(exp.charAt(i));
                break;
            }
        }
        return tarstack.pop() == 'f' ? false : true;
    }
    public static void main(String[] args) {
        System.out.println(new Solution().parseBoolExpr("|(&(t,f,t),!(t))"));
    }
}
