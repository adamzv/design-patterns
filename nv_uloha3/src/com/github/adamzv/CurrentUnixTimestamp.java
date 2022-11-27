package com.github.adamzv;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CurrentUnixTimestamp implements ActionListener {

    private JLabel label;

    @Override
    public void actionPerformed(ActionEvent e) {
        this.label.setText(String.valueOf(System.currentTimeMillis()));
    }

    public CurrentUnixTimestamp(JLabel label) {
        this.label = label;
    }
}
