package org.example.setting;

import org.example.animals.Animal;
import org.example.animals.Duck;
import org.example.animals.Wolf;

import java.util.HashMap;
import java.util.Map;

public class Setting {
    private final int weight;
    private final int satiety;
    private final double max_animals_OnTheField;
    private final int speed;
    public static Map<Setting, Class<? extends Animal>> settingMap= new HashMap();
    public static final Setting WOLF_BASE_SETTING = new Setting(50, 30, 3, 8);
    public static final Setting DUCK_BASE_SETTING = new Setting(1, 200, 0.15, 4);
    public Setting(int weight, int satiety, double max_animals_onTheField, int speed) {
        this.weight = weight;
        this.satiety = satiety;
        this.max_animals_OnTheField = max_animals_onTheField;
        this.speed = speed;
    }
    public static final Map<Class<? extends Animal>, Map<Class<? extends Animal>, Integer>> CHANCE_TO_EAT = new HashMap<>();

    private static final Map<Class<? extends Animal>, Integer> WOLF_CHANCE_TO_EAT = new HashMap<>();
    private static final Map<Class<? extends Animal>, Integer> DUCK_CHANCE_TO_EAT = new HashMap<>();
    static {
        WOLF_CHANCE_TO_EAT.put(Duck.class, 40);
        DUCK_CHANCE_TO_EAT.put(Wolf.class,0);
    }
    public static void getAnimalSettings(){
      settingMap.put(WOLF_BASE_SETTING, Wolf.class);
      settingMap.put(DUCK_BASE_SETTING, Duck.class);


    }
}
