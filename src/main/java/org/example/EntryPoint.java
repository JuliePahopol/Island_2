package org.example;
public class EntryPoint {
    static Location location[][];
 static Herbivore herbivore;
 static Carnivore carnivore;
 static Plant plant;
    public static void main(String[] args) {


        System.out.println(herbivore.eat(plant));
        System.out.println(carnivore.eat(herbivore));

    }
}