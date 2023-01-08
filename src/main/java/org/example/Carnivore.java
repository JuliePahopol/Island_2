package org.example;


public class Carnivore extends Animal {
    Herbivore herbivore;

    @Override
    public boolean eat(Object obj) {
        Carnivore carnivore = (Carnivore) obj;
        System.out.println("Carnivore eats herbivores...");
        return carnivore.eat(herbivore);
    }
}