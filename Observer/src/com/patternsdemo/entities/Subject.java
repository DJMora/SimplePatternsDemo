package com.patternsdemo.entities;

//Contrato para el sujeto que va a alertar a los observadores.

public interface Subject {
    public void registerObserver(Observer o);
    public  void removeObserver(Observer o);
    public void notifyObservers();
}
