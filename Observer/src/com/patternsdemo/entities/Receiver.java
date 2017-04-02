package com.patternsdemo.entities;


import javax.swing.*;

public class Receiver implements Observer {
    private int counter;

    public Receiver(){
        counter = 0;
    }

    @Override
    public void update() {
        counter++;
        JOptionPane.showMessageDialog(null, String.format("Se ha recibido la solicitud %s", Integer.toString(counter)));
    }
}
