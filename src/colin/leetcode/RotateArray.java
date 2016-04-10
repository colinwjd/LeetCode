/**
 * Rotate an array of n elements to the right by k steps.
 *
 * For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].
 */
public class Solution {
    public void rotate(int[] nums, int k) {
        if (k >= nums.length) {
            k = k % nums.length;
        }
        int step = nums.length - k;
        reserve(nums, 0, step - 1);
        reserve(nums, step, nums.length - 1);
        reserve(nums, 0, nums.length - 1);
    }
    private void reserve(int[] arr, int start, int end) {
        if (start < end) {
            int[] temp = new int[end - start + 1];
            for (int j = 0, i = start; i <= end; i++) {
                temp[j++] = arr[i];
            }
            int last = temp.length - 1;
            for (int i = start; i <= end; i++) {
                arr[i] = temp[last--];
            }
        }
    }
}
