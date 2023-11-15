package net.osandman.n1_Two_Sum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int[] twoSumFirstEdition(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int[] copyNums = Arrays.copyOf(nums, nums.length);
        Arrays.sort(copyNums);
        int leftValue = copyNums[left];
        int rightValue = copyNums[right];
        while (left < right) {
            int checkSum = leftValue + rightValue;
            if (checkSum == target) {
                break;
            } else if (checkSum > target) {
                right--;
            } else {
                left++;
            }
            leftValue = copyNums[left];
            rightValue = copyNums[right];
        }
        left = Arrays.stream(nums).boxed().toList().indexOf(leftValue);
        right = Arrays.stream(nums).boxed().toList().lastIndexOf(rightValue);
        return new int[]{left, right};
    }

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> indexes = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int expect = target - nums[i];
            if (indexes.containsKey(expect)) {
                return new int[]{indexes.get(expect), i};
            }
            indexes.put(nums[i], i);
        }
        return null;
    }
}
