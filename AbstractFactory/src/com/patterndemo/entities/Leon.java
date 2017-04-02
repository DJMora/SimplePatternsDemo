package com.patterndemo.entities;

public class Leon extends Carnivoro{
    @Override
    public void Comer(Herbivoro h) {
        System.out.println(this.getClass().getSimpleName()  + " come " + h.getClass().getSimpleName());
    }
}
