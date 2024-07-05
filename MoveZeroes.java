/**
 * 283. Move Zeroes
 *
 * Given an integer array nums, move all 0's to the end of it while maintaining 
 * the relative order of the non-zero elements.
 *
 * Note that you must do this in-place without making a copy of the array.
 *
 * Example 1:
 * Input: nums = [0,1,0,3,12]
 * Output: [1,3,12,0,0]
 *
 * Example 2:
 * Input: nums = [0]
 * Output: [0]
 *
 * Constraints:
 * 1 <= nums.length <= 104
 * -231 <= nums[i] <= 231 - 1
 *
 * Follow up: Could you minimize the total number of operations done?
 */

 import java.util.ArrayList;
 import java.util.List;
 
 public class MoveZeroes{
     public void moveZeroes(List<Integer> nums) {
         int index = 0;  // The position to place the next non-zero element
 
         // First pass: move non-zero elements to the beginning of the list
         for (int i = 0; i < nums.size(); i++) {
             if (nums.get(i) != 0) {
                 nums.set(index, nums.get(i));
                 index++;
             }
         }
 
         // Second pass: fill the remaining positions with zeros
         while (index < nums.size()) {
             nums.set(index, 0);
             index++;
         }
     }
 
     public static void main(String[] args) {
         MoveZeroes solution = new MoveZeroes();
 
         List<Integer> nums1 = new ArrayList<>(List.of(0, 1, 0, 3, 12));
         solution.moveZeroes(nums1);
         System.out.println(nums1); // Output: [1, 3, 12, 0, 0]
 
         List<Integer> nums2 = new ArrayList<>(List.of(0, 0, 1));
         solution.moveZeroes(nums2);
         System.out.println(nums2); // Output: [1, 0, 0]
     }
 }
 