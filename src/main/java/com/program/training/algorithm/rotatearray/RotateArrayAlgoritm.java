package com.program.training.algorithm.rotatearray;

/**
 * Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
 *
 * @author naletov
 */
public class RotateArrayAlgoritm
{
    public void rotateNotOptimal(int[] nums, int k) {
        int length = nums.length;
        int[] result = new int[length];
        k =  k % length; // in case of k > length
        for (int i = 0; i < length; i++)
        {
            result[(i + k) % length] = nums[i];
        }
        System.arraycopy(result, 0, nums, 0, length);
    }

    public void rotateCopyArray(int[] nums, int k) {
        int length = nums.length;
        if (length == 0) {
            return;
        }
        k = k % length;
        int[] result = new int[length];
        System.arraycopy(nums, length - k, result, 0, k);
        System.arraycopy(nums, 0, result, k, length - k);
        System.arraycopy(result, 0, nums, 0, length);
    }

    public void rotate(int[] nums, int k) {
        int n = nums.length;
        if (n == 0) {
            return;
        }
        k = k % n;
        if (k == 0) {
            return;
        }
        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
    }

    private static void reverse(int[] nums, int left, int right) {
        while (left < right) {
            int tmp = nums[left];
            nums[left] = nums[right];
            nums[right] = tmp;
            left++;
            right--;
        }
    }


}
