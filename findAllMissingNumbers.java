// #3 Leetcode 448
// 3 Find all Missing numbers

//Aproach 1
//TC : O(n) & SC: O(n)
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> l = new ArrayList<>();
        HashSet<Integer> hs = new HashSet<>();
        
        // Step 1: Add all numbers from nums to the HashSet
        for(int i : nums){
            hs.add(i);
        }
        
        // Step 2: Check for numbers from 1 to n that are not in the HashSet
        for(int i = 1; i <= nums.length; i++){
            if(!hs.contains(i))
                l.add(i);
        }
        return l;
    }
}

//Aproach 2
//TC : O(n) & SC: O(n) but doesnt use hashing
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        boolean[] isAvailable = new boolean[nums.length]; // Creates an array of size n, initialized to false
        
        // Step 1: Mark numbers present in nums
        for(int i = 0; i < nums.length; i++){
            // The numbers are 1-based, so subtract 1 to get 0-based index
            isAvailable[nums[i] - 1] = true; 
        }
        
        // Step 2: Collect the indices that are still false
        List<Integer> l = new ArrayList<>();
        for(int i = 0; i < isAvailable.length; i++){
            if(!isAvailable[i])
                l.add(i + 1); // Add i+1 because indices are 0-based
        }
        return l;
    }
}