package org.example;

public class Herbivore extends Animal {

    @Override
    public void eat() {
        System.out.println("I eat plants...");
    }
    public static void eatPlant(Plant plant){
        System.out.println("I eat another plant...");

    }
}
