package com.github.adamzv;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Main extends JFrame {

    private JButton button;
    private JLabel label;

    public Main() {
        initComponents();
    }

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    private void initComponents() {
        setTitle("GUI");
        label = new JLabel("text");
        button = new JButton("button");

        button.addMouseListener(new MyListener());
        label.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                label.setText("mouseEntered");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                label.setText("mouseExited");
            }
        });

        LayoutManager layoutManager = new FlowLayout();
        setLayout(layoutManager);

        getContentPane().add(button);
        getContentPane().add(label);
        pack();
    }
}
