package com.github.adamzv;

public class HexFormatter implements NumberFormatter {

    @Override
    public String formatNumber(int number) {
        return Integer.toHexString(number);
    }
}
