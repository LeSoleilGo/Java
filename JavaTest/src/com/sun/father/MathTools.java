package com.sun.father;

/**
 * @Auther: SUN
 * @Date: 2022/11/10 - 11 - 10 - 18:56
 * @Description: com.sun.father
 * @version: 1.0
 */
//- int compare(int a, int b)：比较两个整数大小关系，如果第一个整数比第二个整数大，则返回正整数，如果第一个整数比第二个整数小，则返回负整数，如果两个整数相等则返回0；
//- int compare(double a, double b)：比较两个小数大小关系，如果第一个小数比第二个小数大，则返回正整数，如果第一个小数比第二个小数小，则返回负整数，如果两个小数相等则返回0；
//- int compare(char a, char b)：比较两个字符大小关系，如果第一个字符比第二个字符编码值大，则返回正整数，如果第一个字符比第二个字符编码值小，则返回负整数，如果两个字符相等则返回0；
public class MathTools {
    public int compare(int a, int b) {
        return a - b;
    }

    public int compare(double a, double b) {
        if (a > b) {
            return 1;
        } else if (a < b) {
            return -1;
        } else {
            return 0;
        }
    }

    public int compare(char a, char b) {
        return a - b;
    }
}
