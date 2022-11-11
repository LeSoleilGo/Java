package com.sun.father;

/**
 * @Auther: SUN
 * @Date: 2022/11/10 - 11 - 10 - 16:57
 * @Description: com.sun.father
 * @version: 1.0
 */
public class ArraysTools {
    public String toString(int[] arr) {
        String s = "";
        for (int i = 0; i < arr.length; i++) {
            s = s + arr[i];
            if (i != arr.length - 1) {
                s += " , ";
            }
        }
        return s;
    }

    public String toString(double[] arr) {
        String s = "";
        for (int i = 0; i < arr.length; i++) {
            s = s + arr[i];
            if (i != arr.length - 1) {
                s += " , ";
            }
        }
        return s;
    }

    public String toString(char[] arr) {
        String s = "";
        for (int i = 0; i < arr.length; i++) {
            s = s + arr[i];
            if (i != arr.length - 1) {
                s += " , ";
            }
        }
        return s;
    }

    public int[] grow(int[] arr) {
        int[] arr2 = new int[arr.length * 2];
        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[i];
        }
        return arr2;
    }

    public void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public void sort(double[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    double temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public void sort(char[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    char temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
