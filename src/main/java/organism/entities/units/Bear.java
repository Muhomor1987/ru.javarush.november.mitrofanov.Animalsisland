package organism.entities.units;

import organism.entities.Animal;

import java.util.HashMap;

public class Bear extends Animal {

    public Bear(double WEIGHT_MAX, int SPEED, double SATURATION, HashMap<Class<? extends Animal>, Integer> MAP_OF_FOOD) {
        super(WEIGHT_MAX, SPEED, SATURATION, MAP_OF_FOOD);
    }
}
