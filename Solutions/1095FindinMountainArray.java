
public class Solution {
    class MountainArray{
        public int get(int index) {return 0;}
        public int length() {return 0;}
    }
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int n = mountainArr.length();
        int min = 0, max = n - 1;
        while (max > min) {
            int mid = (max - min) / 2 + min;
            if (mountainArr.get(mid) < mountainArr.get(mid + 1)) {
                min = mid + 1;
            } else { max = mid;}
        }
        int top = max;
        System.out.println(top);
        if (mountainArr.get(top) == target) return max;
        min = 0;
        while (max > min) {
            int mid = (max - min) / 2 + min;
            if (mountainArr.get(mid) < target) {
                min = mid + 1;
            } else { max = mid;}
        }
        if (mountainArr.get(max) == target) return max;
        min = top;
        max = n - 1;
        while (max > min) {
            int mid = (max - min) / 2 + min;
            if (mountainArr.get(mid) > target) {
                min = mid + 1;
            } else { max = mid;}
        }
        if (mountainArr.get(max) == target) return max;
        return -1;
    }
    public static void main(String[] args) {

    }

}
