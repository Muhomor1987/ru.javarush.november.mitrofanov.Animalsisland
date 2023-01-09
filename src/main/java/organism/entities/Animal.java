package organism.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import organism.Organism;

import java.util.HashMap;

public abstract class Animal implements Organism {
    public String name = this.getClass().getSimpleName() + " ";

    public double weight;

//final
    public final double WEIGHT_MAX;
    private final int SPEED;
    private final double SATURATION;

    private final HashMap<Class<? extends Animal>, Integer> MAP_OF_FOOD;
    public Animal(double WEIGHT_MAX, int SPEED, double SATURATION, HashMap<Class<? extends Animal>, Integer> MAP_OF_FOOD) {
        this.WEIGHT_MAX = WEIGHT_MAX;
        this.SPEED = SPEED;
        this.SATURATION = SATURATION;
        this.MAP_OF_FOOD = MAP_OF_FOOD;
    }

    //Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    //Getter methods
    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public double getWEIGHT_MAX() {
        return WEIGHT_MAX;
    }

    public int getSPEED() {
        return SPEED;
    }

    public double getSATURATION() {
        return SATURATION;
    }

    public HashMap<Class<? extends Animal>, Integer> getMAP_OF_FOOD() {
        return MAP_OF_FOOD;
    }







}
