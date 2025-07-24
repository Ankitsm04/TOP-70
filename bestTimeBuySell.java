// #9 LeetCode 121
// 9 Best Time to Buy and Sell Stock

//Aproach 1
//TC: O(n) & SC: O(1)
class Solution {
    public int maxProfit(int[] prices) {
        int l=0,r=1;
        int max = 0;
        while(r != prices.length){
            if(prices[l] < prices[r]){
                int p = prices[r] - prices[l];
                max = Math.max(max,p);
            }
            else{
                l = r;
            }
            r++;
        }
        return max;
    }
}