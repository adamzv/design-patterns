package com.github.adamzv;

public class ClassB extends ClassA {
    private int z;

    public ClassB(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(", z = %s", z);
    }
}
