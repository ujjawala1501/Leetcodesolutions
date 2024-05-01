/*
 Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

Example 1:
Input: nums = [1,2,3,1]
Output: true

Example 2:
Input: nums = [1,2,3,4]
Output: false
Example 3:

Input: nums = [1,1,1,3,3,4,3,2,4,2]
Output: true
 */

import java.util.*;
/*
class Solution {
    public boolean containsDuplicate(int[] nums) {
        int size = nums.length;
        Arrays.sort(nums);
        int n = nums.length;
        for(int i =1; i < size;i++){
            if(nums[i] == nums[i-1]){
                return true;
            }
            
        }
        return false;
    }
}
*/
//Alternate Solution
class Solution {
    public boolean containsDuplicate(int[] nums) {
        int size = nums.length;
        HashMap<Integer,Integer> countNum = new HashMap<Integer,Integer> ();
        for (int i=0;i<size ; i++){
            if(!countNum.containsKey(nums[i])){
                countNum.put(nums[i],1);
            }
            else{
                countNum.put(nums[i],countNum.get(nums[i])+1);
            }

        }
        for(int j=0;j<size;j++){
            if(countNum.get(nums[j])>1){
                return true;
            }
        }
        return false;
    }
}
