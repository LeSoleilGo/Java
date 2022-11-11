package com.sun.param;

/**
 * @Auther: SUN
 * @Date: 2022/11/10 - 11 - 10 - 16:51
 * @Description: com.sun.param
 * @version: 1.0
 */
public class Tools{
    public static void main(String[] args) {
        int i = 0;
        new Tools().change(i);
        i = i++;
        System.out.println("i = " + i);
    }

    void change(int i){
        i++;
    }
}
