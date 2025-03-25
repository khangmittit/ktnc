package com.example.Test2;

public class Bai3 {
    public static float tinhTBC(int[] n) {
        if (n.length == 0) {
            throw new ArithmeticException("Mang rong");
        }
        int sum = 0;
        for (int num : n) {
            sum += num;
        }
        return (float) sum / n.length;
    }
}
