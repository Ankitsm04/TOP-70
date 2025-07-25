// #16 LeetCode 136
// 16 Single Number

//Aproach 1
//TC: O(n) & SC: O(1)
class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        for(int i : nums)
            result ^= i;
        return result;
    }
}