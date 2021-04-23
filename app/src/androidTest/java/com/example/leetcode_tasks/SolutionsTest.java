package com.example.leetcode_tasks;

import junit.framework.TestCase;

import org.junit.Before;
import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.assertEquals;

public class SolutionsTest  {

    Solutions s;

    @Before
    public void init() {
        s = new Solutions();
    }

    @Test
    public void twoSumTest() {

        int arr[] = {1,2,3,4,5,9,5};
        //int arr[] = {6, 1, 0};
        int res = 6;
        int sol[] = s.twoSum(arr, res);

        assertEquals(res, arr[sol[0]] + arr[sol[1]]);
    }

    @Test
    public void testAddTwoNumbers() {

        ListNode<Integer> l1 = new ListNode<>();
        //l1.apend(7);
        l1.apend(9);
        l1.apend(9);



        ListNode<Integer> l2 = new ListNode<>();
        l2.apend(1);
        //l2.apend(2);
        //l2.apend(3);
        //l2.apend(4);

        ListNode<Integer> res = s.addTwoNumbers(l1, l2);

        System.out.println(" l1:" + l1.print());
        System.out.println(" l2:" + l2.print());
        System.out.println("res:" + res.print());


    }

    @Test
    public void lengthOfLongestSubstringTest() {

        String str = "12345123456asdfgasqwertyuiopa";
        //String str = "1112312";
        int sol = s.lengthOfLongestSubstring(str);

        //assertEquals(res, arr[sol[0]] + arr[sol[1]]);
    }


}