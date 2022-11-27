package com.github.adamzv;

public class AddOperation implements Operation {

    @Override
    public void calculate(int n1, int n2) {
        System.out.println(n1 + n2);
    }
}
