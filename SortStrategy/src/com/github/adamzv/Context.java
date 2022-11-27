package com.github.adamzv;

import java.util.Arrays;

public class Context {
    Sorter sorter;

    public Context() {
    }

    public Context(Sorter sorter) {
        this.sorter = sorter;
    }

    public void sort(int[] data) {
        sorter.sort(data);
    }

    public void setSorter(Sorter sorter) {
        this.sorter = sorter;
    }
}
