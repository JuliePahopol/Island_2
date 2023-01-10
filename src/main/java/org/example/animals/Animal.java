package org.example.animals;

import org.example.island.Location;
import org.example.Plant;

import java.util.Iterator;
import java.util.List;

public abstract class Animal extends Thread {
    Thread thread = new Thread(Animal.herbivore);
    Thread thread1 = new Thread(Animal.carnivore);
    public static Carnivore carnivore= new Carnivore();

    public static Herbivore herbivore = new Herbivore();
    public static List<Animal>animals;
    public abstract boolean eat(Object obj);

    private static double satiety;
    private static double MAX_satiety = 100;
    private static double MIN_satiety = 5;
    public Animal(){
        thread.start();
        thread1.start();
    }

    public abstract int move(Location location);

    public boolean move(Location location, Location[][] locations) {
//        Location newLocation = null;
//        if (newLocation != null) {
//            return true;
//
//        } else {
        return false;
    }

    public boolean eatPlant(List<Plant> plants) {
        Herbivore herbivore = new Herbivore();
        while (!plants.isEmpty()) {
            herbivore.eatPlant(plants);
        }
        return true;
    }
    public boolean eatAnimal(List<Herbivore> herbivores){
        while (!herbivores.isEmpty()){
            carnivore.eat(herbivores);
        }
        return true;
    }



    public double getSatiety() {
        return satiety;
    }

    public boolean isHungry() throws InterruptedException {
        if (satiety == MIN_satiety) {
            System.out.println("Animal is hungry...");

        } else if (satiety < MIN_satiety) {
            System.out.println("Animal is starving..."+ die(animals));
            Thread eatOrDie =new Thread();
            eatOrDie.start();
            eatOrDie.wait(4000);
            //последовательно ли будут вызываться эти команды?
            //если животное голодает более 4 секунд,оно умирает



            //потом добавить animal.die после какого-то кол-ва времени))
        } else {
            System.out.println("Animal's satiety is" + getSatiety());
        }

        return true;
    }
    public boolean die(List<Animal>animalList){
        Animal animal = (Animal) animalList;
        Iterator<Animal> animalIterator= animalList.iterator();
        while (animalIterator.hasNext()){
            animalIterator.next();
            animalList.removeIf(animal1 -> animal1.getSatiety()==0);
            }
        return true;
    }
}
