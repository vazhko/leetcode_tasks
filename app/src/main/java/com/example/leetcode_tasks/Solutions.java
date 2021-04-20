package com.example.leetcode_tasks;

import android.util.Log;

import java.util.HashMap;
import java.util.Map;

public class Solutions {

    /**
     * 1. Two Sum
     * Easy
     * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
     * You may assume that each input would have exactly one solution, and you may not use the same element twice.
     * You can return the answer in any order.
     * <p>
     * Example 1:
     * <p>
     * Input: nums = [2,7,11,15], target = 9
     * Output: [0,1]
     * Output: Because nums[0] + nums[1] == 9, we return [0, 1].
     * Example 2:
     * <p>
     * Input: nums = [3,2,4], target = 6
     * Output: [1,2]
     * Example 3:
     * <p>
     * Input: nums = [3,3], target = 6
     * Output: [0,1]
     * <p>
     * Constraints:
     * 2 <= nums.length <= 103
     * -109 <= nums[i] <= 109
     * -109 <= target <= 109
     * Only one valid answer exists.
     */

    public int[] twoSum(int[] nums, int target) {
        int c1 = 0, c2 = 0;

        Map<Integer, Integer> map = new HashMap<>(20);
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if ((map.containsKey(complement) && map.get(complement) != i)) {
                Log.i("Solutions", "sol: {" + i +", " + map.get(complement) + "}");
                return new int[]{i, map.get(complement)};
            }
        }

        throw new IllegalArgumentException("No two sum solution");

    }


}

