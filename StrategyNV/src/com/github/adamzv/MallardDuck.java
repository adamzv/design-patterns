package com.github.adamzv;

/**
 *
 * @author KI
 */
public class MallardDuck  extends Duck {

    public MallardDuck() {
        // diva kacka kacka a lieta mavanim kridlami
        super( new Quack(), new FlyWithWings());
    }

    @Override
    public void display() {
        System.out.println("vidno divu kacku");
    }
}
