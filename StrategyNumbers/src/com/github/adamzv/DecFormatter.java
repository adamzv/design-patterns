package com.github.adamzv;

public class DecFormatter implements NumberFormatter {

    @Override
    public String formatNumber(int number) {
        return String.valueOf(number);
    }
}
