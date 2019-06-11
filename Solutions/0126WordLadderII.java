import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    public boolean check(String s1, String s2) {
        int flg = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                flg++;
                if (flg > 1) return false;
            }
        }
        return true;
    }
    public void dfs(List<List<String>> lists, List<String> list, int start, int step, int[][] graph) {
        if (step == graph[0][graph.length - 1]) {
            if (start == graph.length - 1) {
                lists.add(list);
            }
            return;
        } else if (step == 0) {
            list = new ArrayList<String>();
        } else {
            for (int i = 1; i <= graph.length - 1; i ++) {
                if (graph[start][i] == 1) {
                    dfs(lists, list, i, step + 1, graph);
                }
            }
        }
    }
    public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordListOld) {
        List<List<String>> lists = new ArrayList<>();
        // create a graph
        List<String> wordList = wordListOld;
        wordList.add(0, beginWord);
        wordList.add(endWord);
        int[][] graph = new int[wordList.size()][wordList.size()];
        for (int i = 0; i < wordList.size() - 1; i++) {
            for (int j = i + 1; j < wordList.size(); j++) {
                if (check(wordList.get(i), wordList.get(j))) {
                    graph[i][j] = 1;
                    graph[j][i] = 1;
                } else {
                    graph[i][j] = Integer.MAX_VALUE;
                    graph[j][i] = Integer.MAX_VALUE;
                }
            }
        }
        // calculate the shortest route from [0] to [n] Floyd
        for (int i = 0; i < wordList.size(); i++) {
            for (int j = 0; j < wordList.size(); j++) {
                for (int k = 0; k < wordList.size(); k++) {
                    graph[i][j] = Math.min(graph[i][j], graph[i][k] + graph[k][j]);
                }
            }
        }
        dfs(lists, null, 0, 0, graph);
        return lists;
    }
    public static void main(String[] args) {
        String beginWord = "hit";
        String endWord = "cog";
        String[] wordList = new String[] {"hot","dot","dog","lot","log","cog"};
        System.out.println(new Solution().findLadders(beginWord, endWord, Arrays.asList(wordList)));
    }

}
