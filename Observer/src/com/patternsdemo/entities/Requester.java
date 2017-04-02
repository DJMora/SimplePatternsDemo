package com.patternsdemo.entities;

import java.util.ArrayList;

public class Requester implements Subject {
    private ArrayList<Observer> observers;

    public Requester(){
        observers = new ArrayList<Observer>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int position = observers.indexOf(o);

        if(position >= 0){
            observers.remove(o);
        }
    }

    @Override
    public void notifyObservers() {
        for(int i=0;i<observers.size();i++){
            Observer observer = (Observer)observers.get(i);
            observer.update();
        }
    }
}
