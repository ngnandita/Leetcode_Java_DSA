class Solution {
    public int maxSubArray(int[] nums) {
        // Initialize maxSoFar with the lowest possible value 
        // to handle arrays with all negative numbers.
        int maxSoFar = nums[0];
        int currentSum = 0;
        
        for (int i = 0; i < nums.length; i++) {
            currentSum += nums[i];
            
            // Update the maximum sum found so far
            if (currentSum > maxSoFar) {
                maxSoFar = currentSum;
            }
            
            // If current sum drops below 0, reset it
            if (currentSum < 0) {
                currentSum = 0;
            }
        }
        
        return maxSoFar;
    }
}