package org.example.animals;

import java.util.HashMap;
import java.util.Map;

public class Wolf extends Carnivore {
    private static Map<Class<? extends Animal>, Integer> WOLF_CHANCE_TO_EAT = new HashMap<>();

    @Override
    public boolean eat(Object obj) {
        return eat(obj);
    }
}
