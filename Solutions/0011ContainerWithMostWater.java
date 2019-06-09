
public class Solution {

    public int maxArea(int[] height) {
        int max = 0;
        for (int i = 0; i < height.length - 1; i++) {
            for (int j = 0; j < height.length; j++) {
                int temp = j - i;
                if (height[i] > height[j]) {
                    temp = temp * height[j];
                } else {
                    temp = temp * height[i];
                }
                if (temp > max) max = temp;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(new Solution().maxArea(height));
    }

}
