package org.example;

public class Herbivore extends Animal {
    Plant plant;

    @Override
    public boolean eat(Object obj) {
       Herbivore herbivore = (Herbivore) obj;
        System.out.println("Herbivore eats plants....");
        return herbivore.eat(plant);
    }
}