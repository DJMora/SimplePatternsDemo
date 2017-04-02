package com.patternsdemo.ui;

import com.patternsdemo.admin.Admin;
import com.patternsdemo.entities.Observer;
import com.patternsdemo.entities.Receiver;

import javax.swing.*;

/**
 * Created by david on 4/2/17.
 */
public class frmReceive {
    private JPanel panel1;
    private JLabel lblCount;
    private Receiver observer;

    public frmReceive(){
        observer = new Receiver();
    }

    public JPanel getPanel1() {
        return panel1;
    }

    public void setPanel1(JPanel panel1) {
        this.panel1 = panel1;
    }

    public Observer getObserver() {
        return observer;
    }

    public void setObserver(Receiver observer) {
        this.observer = observer;
    }
}
