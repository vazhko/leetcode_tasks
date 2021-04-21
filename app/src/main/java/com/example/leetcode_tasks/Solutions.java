package com.example.leetcode_tasks;

import android.util.Log;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Solutions {

/*
    1. Two Sum
    Easy

    Share
    Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

    You may assume that each input would have exactly one solution, and you may not use the same element twice.

    You can return the answer in any order.


    Example 1:

    Input: nums = [2,7,11,15], target = 9
    Output: [0,1]
    Output: Because nums[0] + nums[1] == 9, we return [0, 1].
    Example 2:

    Input: nums = [3,2,4], target = 6
    Output: [1,2]
    Example 3:

    Input: nums = [3,3], target = 6
    Output: [0,1]


    Constraints:

    2 <= nums.length <= 103
    -109 <= nums[i] <= 109
    -109 <= target <= 109
    Only one valid answer exists.
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
                Log.i("Solutions", "sol: {" + i + ", " + map.get(complement) + "}");
                return new int[]{i, map.get(complement)};
            }
        }

        throw new IllegalArgumentException("No two sum solution");

    }


    /*
        2. Add Two Numbers
    Medium

    Share
    You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.

    You may assume the two numbers do not contain any leading zero, except the number 0 itself.



    Example 1:


    Input: l1 = [2,4,3], l2 = [5,6,4]
    Output: [7,0,8]
    Explanation: 342 + 465 = 807.
    Example 2:

    Input: l1 = [0], l2 = [0]
    Output: [0]
    Example 3:

    Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
    Output: [8,9,9,9,0,0,0,1]


    Constraints:

    The number of nodes in each linked list is in the range [1, 100].
    0 <= Node.val <= 9
    */
    public ListNode<Integer> addTwoNumbers(ListNode<Integer> l1, ListNode<Integer> l2) {


        ListNode<Integer> res = new ListNode<>();
        NodeItem<Integer> it1 = l1.getHead();
        NodeItem<Integer> it2 = l2.getHead();

        int summ;
        int carry = 0;

        do {
            summ = ((it1 != null) ? it1.getData() : 0) + ((it2 != null) ? it2.getData() : 0) + carry;
            carry = (summ > 9) ? 1 : 0;
            summ = (summ % 10);
            res.apend(summ);
            if (it1 != null) it1 = (it1.getNext() == null) ? null : it1.getNext();
            if (it2 != null) it2 = (it2.getNext() == null) ? null : it2.getNext();

            if ((it1 == null) && (it2 == null) && (carry == 0)) break;

        } while (true);

        return res;
    }


}

