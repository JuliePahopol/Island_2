package org.example;


import org.example.animals.Animal;
import org.example.animals.Carnivore;
import org.example.animals.Herbivore;
import org.example.island.Location;
import org.example.starter.Starter;

import java.util.List;

public class EntryPoint {
    static Location[][] location;

    private static Herbivore herbivore;
    private static Carnivore carnivore;
    private static final Plant plant = new Plant();
    private static Animal animal;


    public static void main(String[] args) {
        Thread thread = new Thread(Animal.herbivore);
        Thread thread1 = new Thread(Animal.carnivore);
//        System.out.println(herbivore.eat(plant));
//        System.out.println(carnivore.eat(herbivore));

    }
}