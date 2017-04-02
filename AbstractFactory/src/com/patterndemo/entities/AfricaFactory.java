package com.patterndemo.entities;

public class AfricaFactory extends ContinenteFactory {
    @Override
    public Herbivoro CrearHerbivoro() {
        return new Antilope();
    }

    @Override
    public Carnivoro CrearCarnivoro() {
        return new Leon();
    }
}
