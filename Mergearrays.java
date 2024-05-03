/*refer this 
 https://www.youtube.com/watch?v=WMxNhIBA92I

 */
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int pntr1 = 0;
        int pntr2 = 0;
        int[] result = new int[m + n];
        int index = 0;
        
        while (pntr1 < m && pntr2 < n) {
            if (nums1[pntr1] < nums2[pntr2]) {
                result[index++] = nums1[pntr1++];
            } else {
                result[index++] = nums2[pntr2++];
            }
        }

        while (pntr1 < m) {
            result[index++] = nums1[pntr1++];
        }

        while (pntr2 < n) {
            result[index++] = nums2[pntr2++];
        }

        for (int i = 0; i < m + n; i++) {
            nums1[i] = result[i];
        }
    }
}
