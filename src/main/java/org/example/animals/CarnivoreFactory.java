package org.example.animals;

import org.example.setting.AnimalFactory;

public class CarnivoreFactory implements AnimalFactory {
    @Override
    public Animal createAnimal(Animal_List animal_TYPE) {
        Carnivore carnivore = new Carnivore();
        switch (animal_TYPE){
            case WOLF -> new Wolf();
            default -> carnivore = null;
        }

        return carnivore;
    }
}
