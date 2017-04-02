package com.patterndemo.entities;

public class AmericaFactory extends ContinenteFactory {
    @Override
    public Herbivoro CrearHerbivoro() {
        return new Bisonte();
    }

    @Override
    public Carnivoro CrearCarnivoro() {
        return new Lobo();
    }
}
