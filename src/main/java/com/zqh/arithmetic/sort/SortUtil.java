package com.zqh.arithmetic.sort;

/**
 * author: zqh
 * email：zqhfsf@gmail.com
 * date: 2018/3/1 17:14
 * description:
 **/
public class SortUtil {

    public static void swap(int[] arr, int a, int b) {
        int tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }
}
