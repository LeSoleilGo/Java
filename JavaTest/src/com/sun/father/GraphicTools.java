package com.sun.father;

/**
 * @Auther: SUN
 * @Date: 2022/11/10 - 11 - 10 - 19:21
 * @Description: com.sun.father
 * @version: 1.0
 */
public class GraphicTools {
    public double area(double bottom, double high) {
        return bottom * high / 2;
    }

    public double area(double a, double b, double c) {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
