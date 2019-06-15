import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {

    private void dfs(List<String> list, String str, Map<Integer, List<Character>> map, int level, int max) {
        if (level > max) {
            list.add(str);
            return;
        }
        for (int i = 0; i < map.get(level).size(); i++) {
            dfs(list, str + map.get(level).get(i), map, level + 1, max);
        }
    }
    public String[] permute(String S) {
        Map<Integer, List<Character>> map = new HashMap<>();
        int index = 0;
        for (int i = 0; i < S.length(); i++) {
            switch(S.charAt(i)) {
            case '{':
                if (i - 1 >= 0 && S.charAt(i - 1) != '}') index++;
                break;
            case '}':
                if (i != S.length() - 1) index++;
                break;
            case ',':
                break;
            default:
                if (i - 1 >= 0 && S.charAt(i - 1) != ',' && 
                S.charAt(i - 1) != '{' && S.charAt(i - 1) != '}') index++;
                if (map.containsKey(index)) {
                    map.get(index).add(S.charAt(i));
                } else {
                    List<Character> list = new ArrayList<>();
                    list.add(S.charAt(i));
                    map.put(index, list);
                }
                break;
            }
        }
        List<String> rtn = new ArrayList<>();
        dfs(rtn, "", map, 0, index);
        Collections.sort(rtn);
        String[] rtnList = new String[rtn.size()];
        for (int i = 0; i < rtn.size(); i++) {
            rtnList[i] = rtn.get(i);
        }
        return rtnList;
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}
