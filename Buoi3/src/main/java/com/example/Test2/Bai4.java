package com.example.Test2;

public class Bai4 {
    public static int getElementAtIndex(int[] n, int index) {
        if (index < 0 || index >= n.length) {
            throw new ArrayIndexOutOfBoundsException("Index vuot qua pham vi");
        }
        return n[index];
    }
}
