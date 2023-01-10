package org.example.setting;

import org.example.animals.Animal;
import org.example.animals.Animal_List;

public interface AnimalFactory {
    Animal createAnimal(Animal_List animal_list);
}
