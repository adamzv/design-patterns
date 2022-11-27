package com.github.adamzv;

public class SubtractOperation implements Operation {

    @Override
    public void calculate(int n1, int n2) {
        System.out.println(n1 - n2);
    }
}
