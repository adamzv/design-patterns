package com.github.adamzv;

public class BinaryFormatter implements NumberFormatter {

    @Override
    public String formatNumber(int number) {
        return Integer.toBinaryString(number);
    }
}
