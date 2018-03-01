package com.zqh.arithmetic.sort;

/**
 * author: zqh
 * email：zqhfsf@gmail.com
 * date: 2018/3/1 17:35
 * description: 排序算法-冒泡排序, 选择排序记住index，之后交换，冒泡是直接交换 >> 总体说选择排序相对与冒泡较好
 * a,b,c,d >> a与b比较交换 >> 大(小)的与c比较交换 >> 大(小)的与d比较交换 >> 最右边的是最大(小)的
 * 公式：
    i∈[0,N-1)               //循环N-1遍
        j∈[i+1,N)           //每遍循环要处理的无序部分
            swap(i,j)          //两两排序（升序/降序）
 **/
public class BubbleSort {

    public void sort(int[] arr) {
        int i, j, len = arr.length;
        for (i = 0; i < len; i++) {
            for (j = i + 1; j < len; j++) {
                if (arr[i] > arr[j]) {
                    SortUtil.swap(arr, i, j);
                }
            }
        }
    }
}
