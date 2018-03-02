package com.zqh.arithmetic;

import com.zqh.arithmetic.sort.*;
import org.junit.Test;

import java.util.Arrays;

/**
 * author: zqh
 * email：zqhfsf@gmail.com
 * date: 2018/3/1 17:19
 * description:
 **/
public class SortTest {
    private int[] arr = {4,1,2,7,9,3,6,5,0,8};

    @Test
    public void testSelectionSort() {
        System.out.println(Arrays.toString(arr));

        SelectionSort ss = new SelectionSort();
        ss.sort(arr);

        System.out.println(Arrays.toString(arr));
    }

    @Test
    public void testBubbleSort() {
        System.out.println(Arrays.toString(arr));

        BubbleSort bs = new BubbleSort();
        bs.sort(arr);

        System.out.println(Arrays.toString(arr));
    }

    @Test
    public void testInsertionSort() {
        System.out.println(Arrays.toString(arr));

        InsertionSort is = new InsertionSort();
        is.sort(arr);

        System.out.println(Arrays.toString(arr));
    }

    @Test
    public void testShellSort() {
        System.out.println(Arrays.toString(arr));

        ShellSort ss = new ShellSort();
        ss.sort(arr);

        System.out.println(Arrays.toString(arr));
    }

    @Test
    public void testQuickSort() {
        System.out.println(Arrays.toString(arr));

        QuickSort qs = new QuickSort();
        qs.sort(arr, 0, arr.length - 1);

        System.out.println(Arrays.toString(arr));
    }

    @Test
    public void testMergeSort() {
        System.out.println(Arrays.toString(arr));

        MergeSort ms = new MergeSort();
        ms.sort(arr);

        System.out.println(Arrays.toString(arr));
    }
}
