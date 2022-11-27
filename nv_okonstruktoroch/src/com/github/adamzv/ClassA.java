package com.github.adamzv;

public class ClassA {
    private int x;
    private int y;

    public ClassA() {
        this(0, 0);
    }

    public ClassA(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public ClassA(int x) {
        this(x, x);
    }

    @Override
    public String toString() {
        return String.format("x = %s, y = %s", x, y);
    }
}
