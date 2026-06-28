class Solution {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }
        
        int max_Profit = 0;
        int buy_price = prices[0];
        
        for (int i = 1; i < prices.length; i++) {
            int curr_profit = prices[i] - buy_price;
            
            if (curr_profit > max_Profit) {
                max_Profit = curr_profit;
            }
            
            if (prices[i] < buy_price) {
                buy_price = prices[i];
            }
        }
        return max_Profit;
    }

    
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(sol.maxProfit(prices)); // Output: 5
    }
}