// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.//

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Map to store: key = number, value = index
        Map<Integer, Integer> numMap = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            
            // Check if the complement exists in the map
            if (numMap.containsKey(complement)) {
                return new int[] { numMap.get(complement), i };
            }
            
            // Store the current number and its index
            numMap.put(nums[i], i);
        }
        
        // Return an empty array if no solution is found (though problem guarantees one)
        return new int[] {};
    }
}