package org.example;

import java.util.Arrays;

public class EntryPoint {
    static Location location[][];
    static Herbivore herbivore;
    static Plant plant;
    public static void main(String[] args) {

        Carnivore.eatAnimal(herbivore);

        Herbivore.eatPlant(plant);

    }
}