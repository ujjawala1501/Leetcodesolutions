/*Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The order of the elements may be changed. Then return the number of elements in nums which are not equal to val. */
import java.util.*;
public class RemoveElement {
    class Solution {
        public int removeElement(int[] nums, int val) {
            int count = 0;
            for(int i=0;i<nums.length;i++){
                if(nums[i]!=val){
                    nums[count]=nums[i];
                    count++;
                }
    
            }
            return count;
        }
    }