package org.example;
import java.util.List;

public abstract class Animal {

    public void eat(List<?> objects, Location location) {
        if (!objects.isEmpty()) {
            if (objects.get(0) instanceof Animal) {
                eatAnimal((List<? extends Animal>) objects);
            } else if (objects.get(0) instanceof Plant) {
                eatPlant((List<Plant>) objects);
            }


        }
    }

    private void eatPlant(List<Plant> plants) {
    }

    private void eatAnimal(List<? extends Animal> animals) {

    }
}