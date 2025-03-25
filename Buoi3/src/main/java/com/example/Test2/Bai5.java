package com.example.Test2;

public class Bai5 {
    private String name;

    public Bai5(String name) {
        if (name == null) {
            throw new NullPointerException("Tên hồ sơ để trống");
        }
        this.name = name;
    }

    public String getTen() {
        return name;
    }
}
