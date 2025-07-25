// # 14 LeetCode 1636
// 14 Minimum Absolute Difference

//Aproach 1
//TC : O(n log n) & SC: O(1)
class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        for(int i=1;i<arr.length;i++){
            min = Math.min(min, arr[i] - arr[i-1]);
        }
        List<List<Integer>> s = new ArrayList<>();
        for(int i=1;i<arr.length;i++){
            if(arr[i] - arr[i-1] == min){
                s.add(Arrays.asList(arr[i-1], arr[i]));
            }
        }
        return s;
    }
}


