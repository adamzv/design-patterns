package com.github.adamzv;

/**
 *
 * @author KI
 */
public class RubberDuck extends Duck {

    public RubberDuck() {
        // gumena kacka piska a nevie lietat
        super( new Squeak(), new FlyNoWay() );
    }

    @Override
    public void display() {
        System.out.println("vidno gumenu kacicku");
    }


}
