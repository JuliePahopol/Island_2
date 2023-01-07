package org.example;

import java.util.List;

public class Carnivore extends Animal {
    public void eat() {

        System.out.println("I eat meat...");

    }

    public static void eatAnimal(Herbivore herbivore){
        System.out.println("I eat another animal");
    }
}
