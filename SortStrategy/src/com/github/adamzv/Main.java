package com.github.adamzv;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] data = {10, 3, 45, 2, -45, 77, -1, 0, 0, 44, 328};
        Context context = new Context();
        context.setSorter(new MinSort());

        context.sort(data);
        for (int x : data) {
            System.out.println(x);
        }
    }
}
