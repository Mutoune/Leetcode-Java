import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    List<String> list = new ArrayList<>();
    private void dfs(String res, String target, List<String> wordDict) {
        if (target.equals("")) {
            list.add(res.substring(1));
            return;
        }
        for (String str : wordDict) {
            if (target.startsWith(str)) {
                res += " " + str;
                dfs(res, target.substring(str.length(), target.length()), wordDict);
                if (res.lastIndexOf(" ") == 0) {
                    res = "";
                } else {
                    res = res.substring(0, res.lastIndexOf(" "));
                }
            }
        }
    }
    public List<String> wordBreak(String s, List<String> wordDict) {
        if (s.length() == 0) return list;
        dfs("", s, wordDict);
        return list;
    }
    public static void main(String[] args) {
//        List<String> wordDict = Arrays.asList(new String[] {"a","aa","aaa","aaaa","aaaaa","aaaaaa","aaaaaaa","aaaaaaaa","aaaaaaaaa","aaaaaaaaaa"});
//        String s = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
        List<String> wordDict = Arrays.asList(new String[] {"cat", "cats", "and", "sand", "dog"});
        String s = "catsanddog";
        System.out.println(new Solution().wordBreak(s, wordDict));
    }

}
