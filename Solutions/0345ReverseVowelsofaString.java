import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;

public class Solution {

    public String reverseVowels(String s) {
        int left = 0;
        int right = s.length() - 1;
        Set<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        set.add('A');
        set.add('E');
        set.add('I');
        set.add('O');
        set.add('U');
        StringBuffer sb = new StringBuffer();
        sb.append(s);
        while (left < right) {
            if (!set.contains(s.charAt(left))) {
                left++;
                continue;
            }
            if (!set.contains(s.charAt(right))) {
                right--;
                continue;
            }
            char ch = s.charAt(left);
            sb.setCharAt(left, s.charAt(right));
            sb.setCharAt(right, ch);
            left++;
            right--;
            
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}
