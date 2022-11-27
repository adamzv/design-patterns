package com.github.adamzv;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Counter implements ActionListener {

    private int counter = 0;
    private JLabel label;

    @Override
    public void actionPerformed(ActionEvent e) {
        this.counter++;
        this.label.setText(String.valueOf(counter));
    }

    public Counter(JLabel label) {
        this.label = label;
    }
}
