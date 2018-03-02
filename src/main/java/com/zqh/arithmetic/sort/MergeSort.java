package com.zqh.arithmetic.sort;

/**
 * author: zqh
 * email：zqhfsf@gmail.com
 * date: 2018/3/2 15:27
 * description: 归并排序
 **/
public class MergeSort {

    public void sort(int[] arr) {
        int len = arr.length;
        int[] result = new int[len];
        int block, start;

        // 原版代码的迭代次数少了一次，没有考虑到奇数列数组的情况
        for(block = 1; block < len; block *= 2) {
            for(start = 0; start <len; start += 2 * block) {
                int low = start;
                int mid = (start + block) < len ? (start + block) : len;
                int high = (start + 2 * block) < len ? (start + 2 * block) : len;
                //两个块的起始下标及结束下标
                int start1 = low;
                int start2 = mid;
                //开始对两个block进行归并排序
                while (start1 < mid && start2 < high) {
                    result[low++] = arr[start1] < arr[start2] ? arr[start1++] : arr[start2++];
                }

                while(start1 < mid) {
                    result[low++] = arr[start1++];
                }

                while(start2 < high) {
                    result[low++] = arr[start2++];
                }
            }
            int[] temp = arr;
            arr = result;
            result = temp;
        }

    }
}
