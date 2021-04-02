package com.example.leetcode_tasks;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class SolutionsUnitTest {


    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    Solutions s;

    @Before
    public void init() {
        s = new Solutions();
    }

    @Test
    public void twoSumTest() {

        int arr[] = {1,2,3,4,5,9,5};
        int res = 6;
        int sol[] = s.twoSum(arr, res);

        assertEquals(res, arr[sol[0]] + arr[sol[1]]);
    }

}