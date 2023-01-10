package org.example.starter;

import org.example.Plant;
import org.example.island.Location;

public class PlantGrow implements Runnable{
    private final Location location;

    public PlantGrow(Location location) {
        this.location = location;
    }

    @Override
    public void run() {
        grow();

    }
    public void grow() {
        int maxCount = location.getMaxOnOneLocation(Plant.class);

        }
    }
