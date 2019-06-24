import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    private boolean compare(String a, String b) {
        if (a.length() != b.length()) return false;
        char[] lista = a.toCharArray();
        char[] listb = b.toCharArray();
        Arrays.sort(lista);
        Arrays.sort(listb);
        for (int i = 0; i < a.length(); i++) {
            if (lista[i] != listb[i]) return false;
        }
        return true;
    }
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < s.length() - p.length() + 1; i++) {
            if (compare(s.substring(i, i + p.length()), p)) list.add(i);
        }
        return list;
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}
