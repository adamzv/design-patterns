package com.github.adamzv;

public class DuckSimulator {

    public static void main(String[] args) {
	    // vytvorme si kacicky
        Duck rubberDuck = new RubberDuck();

        // nechajme ich zakackat a zalietat si
        rubberDuck.performQuack();
        rubberDuck.performFly();

        // zmenit niektorej spravanie
        rubberDuck.setQuackBehavior(new MuteQuack());
        rubberDuck.performQuack();

        // implementovat vlastny sposob kackania
        rubberDuck.setQuackBehavior(new SilentQuack());
        rubberDuck.performQuack();
    }
}
