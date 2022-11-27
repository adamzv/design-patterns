package com.github.adamzv;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;

public class Svet extends javax.swing.JFrame {

    private JList jList;
    private JScrollPane jScrollPane1;
    private JTextArea jTextArea;
    private JScrollPane jScrollPane2;

    private RegisterPriser rp = new RegisterPriser();

    public Svet() {
        initComponents();
        rp.pridajVzorPrisery("voda", new VodnaPrisera("prisera1.txt"));
        rp.pridajVzorPrisery("vzduch", new VzdusnaPrisera("prisera2.txt"));
        rp.pridajVzorPrisery("zem", new ZemskaPrisera("prisera3.txt"));
        rp.pridajVzorPrisery("ohen", new OhnivaPrisera("prisera4.txt"));
    }

    // priprava GUI, zaujimave pre nas bude len model pre JList
    private void initComponents() {

        jScrollPane1 = new JScrollPane();
        jList = new JList();
        jScrollPane2 = new JScrollPane();
        jTextArea = new JTextArea();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Putujeme krajinou");

        jList.setModel(new AbstractListModel() {
            String[] strings = {"zem", "voda", "voda", "ohen", "ohen", "voda", "zem", "vzduch", "vzduch", "vzduch", "zem", "zem", "zem", "voda", "ohen"};

            public int getSize() {
                return strings.length;
            }

            public Object getElementAt(int i) {
                return strings[i];
            }
        });
        jList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        jList.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent evt) {
                jListValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jList);

        jTextArea.setColumns(20);
        jTextArea.setEditable(false);
        jTextArea.setFont(new java.awt.Font("Courier New", 0, 12));
        jTextArea.setRows(5);
        jScrollPane2.setViewportView(jTextArea);

        LayoutManager layoutManager = new BorderLayout();
        setLayout(layoutManager);
        getContentPane().add(jScrollPane1, BorderLayout.WEST);
        getContentPane().add(jScrollPane2, BorderLayout.CENTER);
        pack();
        setSize(800, 600);
    }

    // reakcia pri zmene oznacenej polozky v komponente jList
    // (ci uz mysou alebo klavesnicou)
    private void jListValueChanged(ListSelectionEvent evt) {
        String kdeSom = ((String) jList.getSelectedValue());
        Prisera p = rp.dajPriseru(kdeSom);
        jTextArea.setText(p.ukazSa());
        jTextArea.append("\n\n");
        jTextArea.append(p.urobBububu());
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Svet().setVisible(true);
            }
        });
    }
}
