package com.example.Test2;

public class Bai6 {
    public static int PhanTu(int[] n){
        if(n.length == 0){
            throw new ArithmeticException("Mang rong");
        }
        int a = n[0];
        for(int b : n){
            if(b<a){
                a=b;
            }
        }
        return a;
    }
}
