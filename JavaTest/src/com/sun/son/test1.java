package com.sun.son;

import com.sun.father.MathTools;

/**
 * @Auther: SUN
 * @Date: 2022/11/10 - 11 - 10 - 18:59
 * @Description: com.sun.son
 * @version: 1.0
 */
public class test1 {
    public static void main(String[] args) {
        MathTools tool = new MathTools();
        System.out.println(tool.compare(2, 4));
        System.out.println(tool.compare(2.3, 3.2));
        System.out.println(tool.compare('c', 'e'));
    }
}
