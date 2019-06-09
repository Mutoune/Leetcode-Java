
public class Solution {

    public int reverseBits(int n) {
        int rtn = 0;
        for (int i = 0; i < 32; i++) {
            rtn <<= 1;
            if ((n & 1) == 1) rtn ++;
            n >>= 1;
        }
        return rtn;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().reverseBits(Integer.parseUnsignedInt("00000010100101000001111010011100", 2)));
    }

}
