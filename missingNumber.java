// 2 Missing Number

//Aproach 1
// Index != Value
// TC: O(n log n) && SC: O(1)

class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i) {
                return i;
            }
        }
        return nums.length;
    }
}

//Aproach 2
// TC: O(n) & SC: O(1)
class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = n * (n + 1) / 2;
        for (int num : nums) {
            sum += num;
        }
        return sum - n;
    }
}
