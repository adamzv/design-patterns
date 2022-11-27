package com.github.adamzv;

public class SilentQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("pocut kac kac potichu");
    }
}
