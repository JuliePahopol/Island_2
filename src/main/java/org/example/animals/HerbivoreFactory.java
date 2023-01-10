package org.example.animals;

import org.example.Plant;
import org.example.setting.AnimalFactory;

public class HerbivoreFactory implements AnimalFactory {
    @Override
    public Animal createAnimal(Animal_List animal_TYPE) {
        Herbivore herbivore = new Herbivore();
        switch (animal_TYPE){
            case DUCK -> new Duck();
            default -> herbivore = null;
        }
        return herbivore;
    }
}
