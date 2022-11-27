package com.github.adamzv;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ClassB classB = new ClassB(10,20,30);
        ClassA classA = new ClassA();
        ClassA classA1 = new ClassA(10);
        ClassA classA2 = new ClassA(10,20);
        System.out.println(classB);
        System.out.println(classA);
        System.out.println(classA1);
        System.out.println(classA2);
    }
}
