// #10 LeetCode 977
// 10 Squares of a Sorted Array

//Aproach 1
//TC: O(n log n) & SC: O(1)
class Solution {
    public int[] sortedSquares(int[] nums) {
        for(int i=0;i<nums.length;i++){
            nums[i] *= nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }
}

// Aproach 2
// TC: O(n) & SC: O(1)
class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int left = 0, right = n - 1;
        for (int i = n - 1; i >= 0; i--) {
            if (Math.abs(nums[left]) > Math.abs(nums[right])) {
                ans[i] = nums[left] * nums[left];
                left++;
            } else {
                ans[i] = nums[right] * nums[right];
                right--;
            }
        }
        return ans;
    }
}


