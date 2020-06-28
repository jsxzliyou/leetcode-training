package main.java.com.yoyo.leetcode.case209;

public class Solution {

    public int minSubArrayLen(int s, int[] nums) {

        int l = nums.length;
        if (l == 0) return 0;
        //双指针
        int start = 0,end  = 0;
        int sum = 0;
        int result = nums.length;
        while (end < l) {
            sum+=nums[end];
                while (sum>=s) {
                    result = Math.min(result,end-start+1);
                    sum-=nums[start];
                    start++;
                }
            end++;
        }
        if (start == 0 && sum < s) {
            result = 0;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().minSubArrayLen(7,new int[]{2,3,1,2,4,3}));
    }
}
