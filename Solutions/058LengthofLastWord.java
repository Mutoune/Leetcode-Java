
public class Solution {

    public int lengthOfLastWord(String s) {
        String[] list = s.split(" ");
        return list.length == 0 ? 0 : list[list.length - 1].length();
    }

    public static void main(String[] args) {
        System.out.println(new Solution().lengthOfLastWord("hello world"));
    }

}
