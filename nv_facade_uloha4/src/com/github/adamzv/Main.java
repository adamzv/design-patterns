package com.github.adamzv;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        String name = (String)JOptionPane.showInputDialog("Name");
        JOptionPane.showMessageDialog(null, String.format("Hello %s!", name));
    }
}
