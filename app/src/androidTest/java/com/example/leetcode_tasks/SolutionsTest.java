package com.example.leetcode_tasks;

import junit.framework.TestCase;

import org.junit.Before;
import org.junit.Test;

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

}