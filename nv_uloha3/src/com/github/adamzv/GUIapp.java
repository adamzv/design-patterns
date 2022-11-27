package com.github.adamzv;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUIapp extends JFrame {

    private JButton btn1;
    private JButton btn2;
    private JLabel label;
    private JLabel label2;
    private JLabel label3;

    public GUIapp() {
        initComponents();
    }

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new GUIapp().setVisible(true);
            }
        });
    }

    private void initComponents() {
        setTitle("Experimenty s udalostami a posluchacmi");

        btn1 = new JButton("klikni na mna");
        btn2 = new JButton("odstran jedneho posluchaca");

        label = new JLabel("random");
        label2 = new JLabel("counter");
        label3 = new JLabel("timestamp");

        Counter counter = new Counter(label2);

        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("" + (int) (Math.random()*100));
            }
        });
        btn1.addActionListener(counter);
        btn1.addActionListener(new CurrentUnixTimestamp(label3));

        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btn1.removeActionListener(counter);
            }
        });

        // vzor strategy v praxi
        LayoutManager layoutManager = new FlowLayout();
        setLayout(layoutManager);

        getContentPane().add(btn1);
        getContentPane().add(label);
        getContentPane().add(label2);
        getContentPane().add(label3);
        getContentPane().add(btn2);
        pack();
    }
}
