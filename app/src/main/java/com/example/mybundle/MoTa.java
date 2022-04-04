package com.example.mybundle;

import java.io.Serializable;

public class MoTa implements Serializable {

    private String Ten;
    private int Kg;

    public MoTa(String ten, int kg) {
        Ten = ten;
        Kg = kg;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String ten) {
        Ten = ten;
    }

    public int getKg() {
        return Kg;
    }

    public void setKg(int kg) {
        Kg = kg;
    }
}
