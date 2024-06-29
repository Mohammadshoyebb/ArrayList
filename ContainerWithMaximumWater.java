/*
 * 11. Container With Most Water
Medium
Topics
Companies
Hint
You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).

Find two lines that together with the x-axis form a container, such that the container contains the most water.

Return the maximum amount of water a container can store.

Notice that you may not slant the container.

 

Example 1:


Input: height = [1,8,6,2,5,4,8,3,7]
Output: 49
Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.
Example 2:

Input: height = [1,1]
Output: 1
 

Constraints:

n == height.length
2 <= n <= 105
0 <= height[i] <= 104
 */

import java.util.ArrayList;
 public class ContainerWithMaximumWater{

    public static void main(String[] args) {
        ArrayList<Integer> lst =  new ArrayList<>();
        lst.add(1);
        lst.add(8);
        lst.add(6);
        lst.add(2);
        lst.add(5);
        lst.add(4);
        lst.add(8);
        lst.add(3);
        lst.add(7);
        int n = mostWater(lst); 
        System.out.println(n);
    }
    public static int mostWater(ArrayList<Integer> list){
        ArrayList<Integer> lst = new ArrayList<>();
        int max = -1;
        
        int left = 0;
        int right = lst.size()-1;

        while(left<right){
            int currMax = (Math.min(lst.get(left),lst.get(right))) * (right-left);

            if(left<right){
                left++;
            }else{
                right--;
            }
            max = Math.max(max,currMax);
        }
        return max;
    }  
 }