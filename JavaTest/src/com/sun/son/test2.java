package com.sun.son;

import com.sun.father.ArraysTools;

/**
 * @Auther: SUN
 * @Date: 2022/11/10 - 11 - 10 - 19:10
 * @Description: com.sun.son
 * @version: 1.0
 */
public class test2 {
    public static void main(String[] args) {
        ArraysTools array = new ArraysTools();
        int[] arr = new int[]{3, 2, 6, 1, 2, 5, 7, 1};
        double[] arr1 = new double[]{3.4, 2.5, 2.6, 1.5, 7.6, 6.3, 3.7, 1};
        char[] arr2 = new char[]{'c','a','t','h','b','x','u'};
        array.sort(arr);
        array.sort(arr1);
        array.sort(arr2);
        System.out.println(array.toString(arr));
        System.out.println(array.toString(arr1));
        System.out.println(array.toString(arr2));
    }
}
