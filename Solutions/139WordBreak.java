import java.util.ArrayList;
import java.util.List;

public class Solution {

    public boolean wordBreak(String s, List<String> wordDict) {
        boolean[] flgs = new boolean[s.length()];
        for (int i = 0; i < s.length(); i++) {
            if (wordDict.indexOf(s.substring(0, i + 1)) != -1) {
                flgs[i] = true;
            }
            if (!flgs[i]) {
                for (int j = 0; j < i; j++) {
                    if (flgs[j] && wordDict.indexOf(s.substring(j + 1, i + 1)) != -1) {
                        flgs[i] = true;
                    }
                }
            }
        }
        return flgs[s.length() - 1];
    }
    public static void main(String[] args) {
        List<String> wordDict = new ArrayList<String>();
        wordDict.add("cats");
        wordDict.add("dog");
        wordDict.add("sand");
        wordDict.add("and");
        wordDict.add("cat");
        System.out.println(new Solution().wordBreak("catsandog", wordDict));
    }

}
