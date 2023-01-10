package org.example.animals;


import org.example.island.Location;

public class Carnivore extends Animal implements Runnable {
    Thread action1 = new Thread(Animal.herbivore);
    Thread action2 = new Thread(Animal.carnivore);
    Herbivore herbivore;

    @Override
    public boolean eat(Object obj) {
        action1.start();
        action2.start();
        Carnivore carnivore = (Carnivore) obj;
        System.out.println("Carnivore eats herbivores...");
        return carnivore.eat(herbivore);
    }

    @Override
    public int move(Location location) {
        return herbivore.move(location);
    }

}