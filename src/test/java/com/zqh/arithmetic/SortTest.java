package com.zqh.arithmetic;

import com.zqh.arithmetic.sort.BubbleSort;
import com.zqh.arithmetic.sort.SelectionSort;
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
}
