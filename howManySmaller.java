// #5 LeetCode 1365
// 5 How Many Numbers Are Smaller Than the Current Number

//Aproach 1
//TC: O(n^2) & SC: O(n)

class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int ans[] = new int[nums.length];
        int idx = 0;
        for(int i=0;i<nums.length;i++){
            int count = 0;
            for(int j=0;j<nums.length;j++){
                if(nums[j] < nums[i])
                    count++;
            }
            ans[idx] = count;
            idx++;
        }
        return ans;
    }
}

//Aproach 2
//TC: O(n) & SC: O(n) HashMap

class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int temp[] = Arrays.copyOf(nums,nums.length);
        Arrays.sort(temp);
        HashMap<Integer, Integer> h = new HashMap<>();
        for(int i=0;i<temp.length;i++)
            if(!h.containsKey(temp[i])){
                h.put(temp[i] , i);
        }
        for(int i=0;i<nums.length;i++){
            nums[i] = h.get(nums[i]);
        }
        return nums;
    }
}


