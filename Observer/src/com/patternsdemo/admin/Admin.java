package com.patternsdemo.admin;


import com.patternsdemo.entities.Observer;
import com.patternsdemo.entities.Requester;

public class Admin {

    private Requester requester;

    public Admin(){
        requester = new Requester();
    }

    public void setupObservers(Observer o){
        requester.registerObserver(o);
    }

    public void notifyObservers(){
        requester.notifyObservers();
    }
}
