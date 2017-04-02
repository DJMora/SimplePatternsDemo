package com.patterndemo.admin;

//Singleton Example

import com.patterndemo.entities.Carnivoro;
import com.patterndemo.entities.ContinenteFactory;
import com.patterndemo.entities.Herbivoro;

public class Admin {
    private static  Admin INSTANCE = null;
    private Herbivoro herbivoro;
    private Carnivoro carnivoro;

    private Admin(){

    }

    private  synchronized static void createInstance(){
        if(INSTANCE == null){
            INSTANCE = new Admin();
        }
    }

    public static Admin getInstance(){
        if(INSTANCE == null){
            createInstance();
        }

        return INSTANCE;
    }

    public void initContinent(ContinenteFactory factory){
        herbivoro = factory.CrearHerbivoro();
        carnivoro = factory.CrearCarnivoro();
    }

    public void startFoodChain(){
        carnivoro.Comer(herbivoro);
    }
}
