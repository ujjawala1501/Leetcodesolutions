/*Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

You must implement a solution with a linear runtime complexity and use only constant extra space.

Example 1:

Input: nums = [2,2,1]
Output: 1
Example 2:

Input: nums = [4,1,2,1,2]
Output: 4
Example 3:

Input: nums = [1]
Output: 1 
*/ 

/*
import java.util.*;
class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> countNum= new HashMap<Integer,Integer>();
        int a = nums.length;
        for(int i=0; i<a;i++){
            if(!countNum.containsKey(nums[i])){
                countNum.put(nums[i],1);
            }
            else{
                countNum.put(nums[i],countNum.get(nums[i])+1);
            }
        }
    //To traverse through the hashmap
        for(Map.Entry<Integer,Integer> entry:countNum.entrySet()){
            int key =entry.getKey();
            int value =entry.getValue();

        if(value ==1){
            return key;

        }
        }
        return -1;
        
    }

}
*/
// Alternate Solution Using Bit manipulation XOR

import java.util.*;
class Solution {
    public int SingleNumber(int[] nums){
        int result = 0;

        for(int i=0;i<nums.length;i++){
            result ^=nums[i];
        }
        return result;
    }
}
