package com.zqh.arithmetic.sort;

import java.util.Arrays;

/**
 * author: zqh
 * email：zqhfsf@gmail.com
 * date: 2018/3/2 15:07
 * description: 快速排序
 * ①. 从数列中挑出一个元素，称为"基准"（pivot）。
 * ②. 重新排序数列，所有比基准值小的元素摆放在基准前面，所有比基准值大的元素摆在基准后面（相同的数可以到任一边）。
 *  在这个分区结束之后，该基准就处于数列的中间位置。这个称为分区（partition）操作。
 * ③. 递归地（recursively）把小于基准值元素的子数列和大于基准值元素的子数列排序。
 **/
public class QuickSort {

    public void sort(int[] arr, int head, int tail) {
        if (head >= tail || arr == null || arr.length <= 1) return;

        int i = head, j = tail, pivot = arr[(head + tail) / 2];
        while (i <= j) {
            while (arr[i] < pivot) ++i;
            while (arr[j] > pivot) --j;

            if (i < j) {
                SortUtil.swap(arr, i, j);
                ++i;--j;
            } else if (i == j) {
                ++i;
            }
        }

        sort(arr, head, j);
        sort(arr, i, tail);
    }
}
