package com.zqh.arithmetic.sort;

import java.util.Arrays;

/**
 * author: zqh
 * email：zqhfsf@gmail.com
 * date: 2018/3/2 13:47
 * description: 希尔排序
 * 希尔排序是先将整个待排序的记录序列分割成为若干子序列分别进行直接插入排序，
 * 待整个序列中的记录“基本有序”时，再对全体记录进行依次直接插入排序。
 **/
public class ShellSort {

    public void sort(int[] arr) {
        int gap = 1, i, j, len = arr.length;
        while (gap < len / 3)
            gap = gap * 3 + 1; // <O(n^(3/2)) by Knuth,1973>: 1, 4, 13, 40, 121, ...

        for (; gap > 0; gap /= 3) {
            for (i = 0; (i + gap) < len; i++) {
                for (j = 0; (j + gap) < len; j += gap) {
                    if (arr[j] > arr[j + gap]) {
                        SortUtil.swap(arr, j, j + gap);
                    }
                }
            }
        }
    }
}
