package com.my.demo;

/**
 * @auther cuimiao
 * @date 2017/11/19/019  23:50
 * @deprecated 冒泡排序.
 */
public class BubbleSort {

    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return;
    }

    public static void main(String[] args) {
        int [] arr =  {2,1,5,3,7};
        BubbleSort.sort(arr);
        for (Integer a : arr){
            System.out.println(a);
        }
    }
}
