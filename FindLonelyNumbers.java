/*
 * 2150. Find All Lonely Numbers in the Array
Solved
Medium
Topics
Companies
Hint
You are given an integer array nums. A number x is lonely when it appears only once, and no adjacent numbers (i.e. x + 1 and x - 1) appear in the array.

Return all lonely numbers in nums. You may return the answer in any order.

 

Example 1:

Input: nums = [10,6,5,8]
Output: [10,8]
Explanation: 
- 10 is a lonely number since it appears exactly once and 9 and 11 does not appear in nums.
- 8 is a lonely number since it appears exactly once and 7 and 9 does not appear in nums.
- 5 is not a lonely number since 6 appears in nums and vice versa.
Hence, the lonely numbers in nums are [10, 8].
Note that [8, 10] may also be returned.
Example 2:

Input: nums = [1,3,5,3]
Output: [1,5]
Explanation: 
- 1 is a lonely number since it appears exactly once and 0 and 2 does not appear in nums.
- 5 is a lonely number since it appears exactly once and 4 and 6 does not appear in nums.
- 3 is not a lonely number since it appears twice.
Hence, the lonely numbers in nums are [1, 5].
Note that [5, 1] may also be returned.
 

Constraints:

1 <= nums.length <= 105
0 <= nums[i] <= 106
 */

 import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FindLonelyNumbers {

    // Approach using HashMap
    public static List<Integer> findLonely1(int[] nums) {
        List<Integer> result = new ArrayList<>();
        
        if (nums.length == 1) {
            result.add(nums[0]);
            return result;
        }
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        // Count frequencies
        for (int ele : nums) {
            map.put(ele, map.getOrDefault(ele, 0) + 1);
        }
        
        // Check for lonely numbers
        for (int ele : nums) {
            if (map.get(ele) == 1 && !map.containsKey(ele + 1) && !map.containsKey(ele - 1)) {
                result.add(ele);
            }
        }
        
        return result;
    }

    // Approach using frequency array
    public static List<Integer> findLonely2(int[] nums) {
        List<Integer> result = new ArrayList<>();
        
        if (nums.length == 0) {
            return result;
        }
        
        int max = 0;
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
        }

        int[] freq = new int[max + 2];
        
        // Count frequencies
        for (int num : nums) {
            freq[num]++;
        }

        // Identify lonely numbers
        for (int num : nums) {
            if (freq[num] == 1) {
                if (num == 0 && freq[num + 1] == 0) {
                    result.add(num);
                } else if (num != 0 && freq[num - 1] == 0 && freq[num + 1] == 0) {
                    result.add(num);
                }
            }
        }
        
        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 3, 5, 3};
        int[] nums2 = {10, 6, 5, 8};
        int[] nums3 = {4, 5, 6, 8, 9, 9, 5, 4, 3};
        int[] nums4 = {1, 2, 3, 4, 5, 6, 7};
        int[] nums5 = {5, 6, 7, 8, 9};
        int[] nums6 = {10, 9, 8, 7, 6};
        int[] nums7 = {5};
        int[] nums8 = {7, 7, 7, 7, 7};

        // Using HashMap approach
        List<Integer> result1 = findLonely1(nums1);
        System.out.println("Using HashMap approach for nums1: " + result1); // Expected output: [1, 5]

        List<Integer> result2 = findLonely1(nums2);
        System.out.println("Using HashMap approach for nums2: " + result2); // Expected output: [10, 8]

        List<Integer> result3 = findLonely1(nums3);
        System.out.println("Using HashMap approach for nums3: " + result3); // Expected output: [6, 8]

        List<Integer> result4 = findLonely1(nums4);
        System.out.println("Using HashMap approach for nums4: " + result4); // Expected output: []

        List<Integer> result5 = findLonely1(nums5);
        System.out.println("Using HashMap approach for nums5: " + result5); // Expected output: [8, 9]

        List<Integer> result6 = findLonely1(nums6);
        System.out.println("Using HashMap approach for nums6: " + result6); // Expected output: [10]

        List<Integer> result7 = findLonely1(nums7);
        System.out.println("Using HashMap approach for nums7: " + result7); // Expected output: [5]

        List<Integer> result8 = findLonely1(nums8);
        System.out.println("Using HashMap approach for nums8: " + result8); // Expected output: []

        System.out.println();

        // Using frequency array approach
        List<Integer> result9 = findLonely2(nums1);
        System.out.println("Using frequency array approach for nums1: " + result9); // Expected output: [1, 5]

        List<Integer> result10 = findLonely2(nums2);
        System.out.println("Using frequency array approach for nums2: " + result10); // Expected output: [10, 8]

        List<Integer> result11 = findLonely2(nums3);
        System.out.println("Using frequency array approach for nums3: " + result11); // Expected output: [6, 8]

        List<Integer> result12 = findLonely2(nums4);
        System.out.println("Using frequency array approach for nums4: " + result12); // Expected output: []

        List<Integer> result13 = findLonely2(nums5);
        System.out.println("Using frequency array approach for nums5: " + result13); // Expected output: [8, 9]

        List<Integer> result14 = findLonely2(nums6);
        System.out.println("Using frequency array approach for nums6: " + result14); // Expected output: [10]

        List<Integer> result15 = findLonely2(nums7);
        System.out.println("Using frequency array approach for nums7: " + result15); // Expected output: [5]

        List<Integer> result16 = findLonely2(nums8);
        System.out.println("Using frequency array approach for nums8: " + result16); // Expected output: []
    }
}
