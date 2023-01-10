package org.example.island;

import org.example.Plant;
import org.example.animals.*;
import org.example.setting.AnimalFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Location {
    int x;
    int y;
    private final List<Carnivore> carnivoreList;
    private final List<Herbivore> herbivoreList;
    
    Object[][] coordinates = new Object[x][y];
    private final int maxOnOneLocation;
    private final int maxCount = 3;
    public Location(Coordinates coordinates, int maxOnOneLocation) {
        this.maxOnOneLocation = maxOnOneLocation;
        carnivoreList = (List<Carnivore>) createAnimals(new CarnivoreFactory());
        herbivoreList =(List<Herbivore>) createAnimals(new HerbivoreFactory());
    }


    public void move(Location[][] locations) {
        herbivoreList.removeIf(herbivore -> herbivore.move(this, locations));
        carnivoreList.removeIf(carnivore -> carnivore.move(this, locations));
    }


    public void setX(int x) {

    }

    public int getX() {
        return x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return y;
    }

    public void die() {
        carnivoreList.removeIf(predator -> predator.die((List<Animal>) this));
        herbivoreList.removeIf(herbivore -> herbivore.die((List<Animal>) this));
    }
//по одному животному в каждой клетке
    public int getMaxOnOneLocation(Class<?> o) {

        return 0;
    }
    public int getRandomCount(int maxCount) {
        return ThreadLocalRandom.current().nextInt(maxOnOneLocation);
    }
    private List<Plant> createPlants() {
        List<Plant> plantList = new ArrayList<>();
        int plantCount = getRandomCount(getMaxOnOneLocation(Plant.class));
        for (int i = 0; i < plantCount; i++) {
            plantList.add(new Plant());
        }
        return plantList;
}
    private List<? extends Animal> createAnimals(AnimalFactory factory) {
        List<Animal> animalList = new ArrayList<>();
        Animal_List[] animalTypes = Animal_List.values();
        for (Animal_List animalType : animalTypes) {
            Animal animal = factory.createAnimal(animalType);
            if (animal == null) {
                continue;
            }
            int animalCount = getRandomCount(maxCount);
            for (int i = 0; i < animalCount; i++) {
                animalList.add(factory.createAnimal(animalType));
            }
        }
        return animalList;
    }

}
