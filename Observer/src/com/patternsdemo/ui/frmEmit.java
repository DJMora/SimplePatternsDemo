package com.patternsdemo.ui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.patternsdemo.admin.*;


public class frmEmit {

    private JButton emitSignalButton;
    private JPanel panel1;
    private static Admin admin;

    public frmEmit() {
        emitSignalButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                admin.notifyObservers();
            }
        });
    }

    public static void main(String[] args) {

        JFrame frame = new JFrame("Requester Form");
        frame.setContentPane(new frmEmit().panel1);
        frame.setSize(200,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.pack();

        frmReceive r = new frmReceive();
        JFrame frame2 = new JFrame("Receiver Form");
        frame2.setContentPane(r.getPanel1());
        frame2.setSize(200,300);
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        admin = new Admin();
        admin.setupObservers(r.getObserver());

        frame.setVisible(true);
        frame2.setVisible(true);


    }
}
