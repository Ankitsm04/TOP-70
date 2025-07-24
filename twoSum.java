// #4 Leetcode 1
// 4 Two Sum

//Aproach 1
//TC: O(n^2) & SC: O(1)
class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i] + nums[j] == target)
                    return new int[] {i , j};
            }
        }
        return new int[] {0 , 0};
    }
}

//Aproach 1
//TC: O(n) & SC: O(n) hashMap
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int complement = target - nums[i];
            if(map.containsKey(complement)){
                return new int[] {i , map.get(complement)};
            }
            map.put(nums[i] , i);
        }
        return new int[] {0 , 0};
    }
}
