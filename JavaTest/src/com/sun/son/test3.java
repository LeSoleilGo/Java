package com.sun.son;

import com.sun.father.GraphicTools;

/**
 * @Auther: SUN
 * @Date: 2022/11/10 - 11 - 10 - 19:24
 * @Description: com.sun.son
 * @version: 1.0
 */
public class test3 {
    public static void main(String[] args) {
        GraphicTools graphicTools = new GraphicTools();
        System.out.println(graphicTools.area(3, 4));
        System.out.println(graphicTools.area(3, 4, 5));
    }
}
