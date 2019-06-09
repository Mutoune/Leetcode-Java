
public class Solution {

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int[] indgree = new int[numCourses];
        for (int i = 0; i < prerequisites.length; i++) {
            indgree[prerequisites[i][1]]++;
        }
        int index;
        int count = 0;
        do {
            index = -1;
            for (int i = 0; i < numCourses; i++) {
                if (indgree[i] == 0) {
                    index = i;
                    indgree[i] = -1;
                    count++;
                    break;
                }
            }
            if (index != -1) {
                for (int i = 0; i < prerequisites.length; i++) {
                    if (prerequisites[i][0] == index) {
                        indgree[prerequisites[i][1]]--;
                    }
                }
            }
        } while (index != -1);
        if (count == numCourses) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(new Solution().canFinish(2, new int[][] {{1, 0}}));
    }

}
