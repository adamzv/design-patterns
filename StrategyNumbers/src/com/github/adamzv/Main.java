package com.github.adamzv;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        NumberFormatter binaryFormatter = new BinaryFormatter();// HexNumberFormatter
        Number n = new IntegerNumber(478, binaryFormatter);
        n.display();

        n.setNumberFormatter(new HexFormatter());
        n.display();

        n.setNumberFormatter(new DecFormatter());
        n.display();

        System.out.println();

        ////////////////

        Calculator calculator = new Calculator(4, 3, new AddOperation());
        calculator.calculate();

        calculator.setOperation(new SubtractOperation());
        calculator.calculate();

        calculator.setOperation(new MultipleOperation());
        calculator.calculate();

        calculator.setOperation(new DivisionOperation());
        calculator.calculate();
    }
}
