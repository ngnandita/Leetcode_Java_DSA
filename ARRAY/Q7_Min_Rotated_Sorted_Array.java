class Solution {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        // While the search space has more than one element
        while (left < right) {
            int mid = left + (right - left) / 2;

            // If the middle element is greater than the rightmost element,
            // the minimum must be in the right half (excluding mid).
            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } 
            // If the middle element is less than or equal to the rightmost,
            // the minimum is either at mid or to the left of mid.
            else {
                right = mid;
            }
        }

        // When the loop terminates, left == right, pointing to the minimum.
        return nums[left];
    }
}