/*Given an array nums of size n, return the majority element.
The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

Example 1:
Input: nums = [3,2,3]
Output: 3

Example 2:
Input: nums = [2,2,1,1,1,2,2]
Output: 2
 * 
 */
import java.util.*;
class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int appears = n/2 ;
        HashMap<Integer,Integer> sampleList = new HashMap<Integer,Integer>() ;

        for(int i=0;i<n;i++){
            if(!sampleList.containsKey(nums[i])){
            sampleList.put(nums[i],1);
            }
            else{
                sampleList.put(nums[i],sampleList.get(nums[i])+1);
            }
        }
        for(int j=0 ;j<n;j++){
            if(sampleList.get(nums[j])>appears){
                return nums[j];
            }
        }
    return -1;
    }
}