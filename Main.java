/*Given an integer array nums sorted in non-decreasing order, remove some duplicates in-place such that each unique element appears at most twice. The relative order of the elements should be kept the same.
Since it is impossible to change the length of the array in some languages, you must instead have the result be placed in the first part of the array nums. More formally, if there are k elements after removing the duplicates, then the first k elements of nums should hold the final result. It does not matter what you leave beyond the first k elements. */
//Refer to this : https://www.youtube.com/watch?v=OZaADxYTfD4

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1, 1, 1, 2, 2, 3};
        int length = solution.removeDuplicates(nums);
        System.out.println("Length after removal of duplicates: " + length);
        System.out.println("Updated Array:");
        for (int i = 0; i < length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}

class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length < 3) return nums.length;
        int in = 2;
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] != nums[in - 2]) {
                nums[in++] = nums[i];
            }
        }
        return in;
    }
}
