class Solution {
    public int maxProduct(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        
        int maxSoFar = nums[0];
        int minSoFar = nums[0];
        int result = maxSoFar;
        
        for (int i = 1; i < nums.length; i++) {
            int curr = nums[i];
            
            // If current number is negative, swap max and min
            if (curr < 0) {
                int temp = maxSoFar;
                maxSoFar = minSoFar;
                minSoFar = temp;
            }
            
            // Update max and min for the current position
            maxSoFar = Math.max(curr, maxSoFar * curr);
            minSoFar = Math.min(curr, minSoFar * curr);
            
            // Update global result
            result = Math.max(result, maxSoFar);
        }
        
        return result;
    }
}