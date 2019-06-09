
public class Solution {

    public String addBinary(String a, String b) {
        int len = a.length() > b.length() ? a.length() : b.length();
        int[] res = new int[len];
        int lenb = b.length() - 1;
        int lena = a.length() - 1;
        int lres = 0;
        int flg = 0;
        while (lenb >= 0 || lena >= 0) {
            int temp = flg;
            if (lenb >=0) temp += b.charAt(lenb) - '0';
            if (lena >=0) temp += a.charAt(lena) - '0';
            if (temp > 1) {
                flg = 1;
                temp = temp - 2;
            } else flg = 0;
            res[lres] = temp;
            lres++;
            lena--;
            lenb--;
        }
        String str = "";
        if (flg == 1) str += "1";
        for (int i = len - 1; i >= 0; i--) {
            str += res[i];
        }
        return str;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().addBinary("1111", "1111"));
    }

}
