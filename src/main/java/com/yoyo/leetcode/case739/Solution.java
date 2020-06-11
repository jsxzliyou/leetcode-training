package main.java.com.yoyo.leetcode.case739;

public class Solution {

    public int[] dailyTemperatures(int[] T) {

        int[] result = new int[T.length];
        for (int i = 0;i<T.length;i++){
            for (int j = i+1;j<T.length;j++){
                if (T[j] > T[i]) {
                    result[i] = j-i;
                    break;
                }
                result[i] = 0;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        new Solution().dailyTemperatures(new int[]{73, 74, 75, 71, 69, 72, 76, 73});
    }
}
