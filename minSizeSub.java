// #15 LeetCode 209
// 15 Minimum Size Subarray Sum

//Aproach 1
//TC: O(n) & SC: O(1)
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l = 0;
        int total = 0;
        int ans = Integer.MAX_VALUE;
        for(int r=0;r<nums.length;r++){
            total += nums[r];
            while(total >= target){
                ans = Math.min(ans,r-l+1);
                total -= nums[l];
                l++;
            }
        }
        if(ans == Integer.MAX_VALUE)
            return 0;
        return ans;
    }
}