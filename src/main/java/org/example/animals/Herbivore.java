package org.example.animals;

import org.example.island.Location;
import org.example.Plant;

import java.util.List;

public class Herbivore extends Animal {
    List<Plant> plants;

    @Override
    public boolean eat(Object obj) {
        System.out.println("Herbivore eats plants....");

        return herbivore.eatPlant(plants);
    }


    @Override
    public int move(Location location) {
        return 0;
    }

}