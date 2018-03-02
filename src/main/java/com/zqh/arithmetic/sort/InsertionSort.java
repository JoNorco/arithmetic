package com.zqh.arithmetic.sort;

/**
 * author: zqh
 * email：zqhfsf@gmail.com
 * date: 2018/3/2 13:10
 * description: 插入排序,时间复杂度最坏情况下：O(N^2);最好情况下O(N)
 *  1.从第一个元素开始，该元素可以认为已经被排序
     2.取出下一个元素，和前面的元素比较交换，如果更大（小），直接break

 如：1,2,3,0 >> break,break >> 1,2,0,3 >> 1,0,2,3 >> 0,1,2,3
 *
 **/
public class InsertionSort {

    public void sort(int[] arr) {
        int i, j, len = arr.length;
        for (i = 0; i < len - 1; i++) {
            for (j = i + 1; j > 0; j--) {
                if (arr[j] >= arr[j - 1])
                    break;
                SortUtil.swap(arr, j, j - 1);
            }
        }
    }
}
