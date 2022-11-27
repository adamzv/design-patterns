package com.github.adamzv;

public class Calculator {
    private int number1;
    private int number2;
    private Operation operation;

    public Calculator(int number1, int number2, Operation operation) {
        this.number1 = number1;
        this.number2 = number2;
        this.operation = operation;
    }

    public void calculate() {
        operation.calculate(number1, number2);
    }

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    public void setOperation(Operation operation) {
        this.operation = operation;
    }
}
