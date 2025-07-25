// # 13 LeetCode 219
// 13 Contains Duplicate II

//Aproach 1
//TC: O(n) & SC: O(k)
import java.util.HashSet;
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> h = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(h.contains(nums[i]))
                return true;
            
            h.add(nums[i]);

            if(h.size() > k)
                h.remove(nums[i-k]);
        }
        return false;
    }
}