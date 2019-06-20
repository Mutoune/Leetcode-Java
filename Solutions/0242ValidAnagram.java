import java.util.Arrays;

public class Solution {

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        char[] listS = s.toCharArray();
        char[] listT = t.toCharArray();
        Arrays.sort(listS);
        Arrays.sort(listT);
        for (int i = 0; i < listS.length; i++) {
            if (listS[i] != listT[i]) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}
