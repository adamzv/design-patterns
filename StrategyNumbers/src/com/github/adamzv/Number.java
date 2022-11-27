package com.github.adamzv;

public abstract class Number {
    NumberFormatter numberFormatter;
    private int number;

    public Number(int number, NumberFormatter numberFormatter) {
        this.numberFormatter = numberFormatter;
        this.number = number;
    }

    public void display() {
        System.out.println(numberFormatter.formatNumber(number));
    }

    public NumberFormatter getNumberFormatter() {
        return numberFormatter;
    }

    public void setNumberFormatter(NumberFormatter numberFormatter) {
        this.numberFormatter = numberFormatter;
    }
}
