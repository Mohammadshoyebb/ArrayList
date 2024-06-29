/*
 * 896. Monotonic Array
Solved
Easy
Topics
Companies
An array is monotonic if it is either monotone increasing or monotone decreasing.

An array nums is monotone increasing if for all i <= j, nums[i] <= nums[j]. An array nums is monotone decreasing if for all i <= j, nums[i] >= nums[j].

Given an integer array nums, return true if the given array is monotonic, or false otherwise.

 

Example 1:

Input: nums = [1,2,2,3]
Output: true
Example 2:

Input: nums = [6,5,4,4]
Output: true
Example 3:

Input: nums = [1,3,2]
Output: false
 

Constraints:

1 <= nums.length <= 105
-105 <= nums[i] <= 105
 */



public class MonotonicArray {
    
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 2, 3};
        int[] arr2 = {6, 5, 4, 4};
        int[] arr3 = {1, 3, 2};

        Solution solution = new Solution();
        System.out.println("Using first approach:");
        System.out.println(isMonotonic(arr1)); // Output: true
        System.out.println(isMonotonic(arr2)); // Output: true
        System.out.println(isMonotonic(arr3)); // Output: false

        System.out.println("Using second approach:");
        System.out.println(solution.isMonotonic(arr1)); // Output: true
        System.out.println(solution.isMonotonic(arr2)); // Output: true
        System.out.println(solution.isMonotonic(arr3)); // Output: false
    }

    /**
     * First approach: Using two flags to check monotonicity
     */
    public static boolean isMonotonic(int[] nums) {
        if (nums.length <= 1) return true;

        boolean isIncreasing = true;
        boolean isDecreasing = true;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                isDecreasing = false;
            } 
            if (nums[i] < nums[i - 1]) {
                isIncreasing = false;
            }
        }

        return isIncreasing || isDecreasing;
    }

    /**
     * Second approach: Using early exit strategy
     */
    static class Solution {
        public boolean isMonotonic(int[] nums) {
            int i = 0;
            while (i < nums.length - 1) {
                if (nums[i] < nums[i + 1]) {
                    break;
                }
                i++;
            }
            if (i == nums.length - 1) {
                return true;
            }
            i = 0;
            while (i < nums.length - 1) {
                if (nums[i] > nums[i + 1]) {
                    break;
                }
                i++;
            }
            if (i == nums.length - 1) {
                return true;
            }
            return false;
        }
    }
}
