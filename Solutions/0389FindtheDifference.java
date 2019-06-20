import java.util.Arrays;

public class Solution {

    public char findTheDifference(String s, String t) {
        char[] lists = s.toCharArray();
        char[] listt = t.toCharArray();
        Arrays.sort(lists);
        Arrays.sort(listt);
        for (int i = 0; i < lists.length; i++) {
            if (lists[i] != listt[i]) return listt[i];
        }
        return listt[listt.length - 1];
    }
    public static void main(String[] args) {

    }

}
