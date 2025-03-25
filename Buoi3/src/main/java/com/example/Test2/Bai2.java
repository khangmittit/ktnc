package com.example.Test2;

public class Bai2 {
    public static float thuong(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Khong chia duoc cho so 0");
        }
        return (float) a / b;
    }
}
