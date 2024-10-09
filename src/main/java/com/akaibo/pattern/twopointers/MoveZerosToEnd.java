package com.akaibo.pattern.twopointers;

/**
 * Problem 2: Given an array of integers, move all zeros to the end of the array.
 */
public class MoveZerosToEnd {
    public int[] moveZeros(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            if (nums[right] == 0) {
                right -= 1;
            } else if (nums[left] == 0) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left += 1;
                right -= 1;
            } else {
                left += 1;
            }
        }
        return nums;
    }
}
