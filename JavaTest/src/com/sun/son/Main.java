package com.sun.son;

import com.sun.father.ArraysTools;

/**
 * @Auther: SUN
 * @Date: 2022/11/7 - 11 - 07 - 20:47
 * @Description: com.sun.son
 * @version: 1.0
 */
public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{
                1, 2, 3, 4, 5
        };
        ArraysTools tools = new ArraysTools();
        System.out.println(tools.toString(arr));
        System.out.println(tools.grow(arr).length);
    }
}
