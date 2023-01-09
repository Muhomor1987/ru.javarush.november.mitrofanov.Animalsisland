package util;

import Settins.Constants;
import islandStructure.Location;
import organism.Animals;
import organism.Organism;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class FabricAnimal {

    ArrayList<Organism> organismsFree = new ArrayList<Organism>();

    public void createAnimal(Integer addCount, Class<? extends Organism> clazz, Location location){
        for (int i = 0; i < addCount; i++) {

        }
    }

    Constants constants;  //убрать

    private int counterWolf;   //  Вместо переменны добавь мапу
    private int counterBoa;
    private int counterFox;
    private int counterBear;
    private int counterEagle;
    private int counterHorse;
    private int counterDeer;
    private int counterRabbit;
    private int counterMouse;
    private int counterGoat;
    private int counterBoar;
    private int counterDuck;
    private int counterBuffalo;
    private int counterCaterpillar;
    private int counterPlant;


    public FabricAnimal(Constants constants) {
        this.constants = constants;
    }



    public ArrayList<Organism> getLocationCountOrganismFirstTime(Constants constants) {

        ArrayList<Organism> result = new ArrayList<Organism>();

        this.counterWolf= ThreadLocalRandom.current().nextInt(constants.getMAX_WOLF_ON_LOCATION());
        this.counterBoa=ThreadLocalRandom.current().nextInt(constants.getMAX_BOA_ON_LOCATION());
        this.counterFox=ThreadLocalRandom.current().nextInt(constants.getMAX_FOX_ON_LOCATION());
        this.counterBear=ThreadLocalRandom.current().nextInt(constants.getMAX_BEAR_ON_LOCATION());
        this.counterEagle=ThreadLocalRandom.current().nextInt(constants.getMAX_EAGLE_ON_LOCATION());
        this.counterHorse=ThreadLocalRandom.current().nextInt(constants.getMAX_HORSE_ON_LOCATION());
        this.counterDeer=ThreadLocalRandom.current().nextInt(constants.getMAX_DEER_ON_LOCATION());
        this.counterRabbit=ThreadLocalRandom.current().nextInt(constants.getMAX_RABBIT_ON_LOCATION());
        this.counterMouse=ThreadLocalRandom.current().nextInt(constants.getMAX_MOUSE_ON_LOCATION());
        this.counterGoat=ThreadLocalRandom.current().nextInt(constants.getMAX_GOAT_ON_LOCATION());
        this.counterBoar=ThreadLocalRandom.current().nextInt(constants.getMAX_BOAR_ON_LOCATION());
        this.counterDuck=ThreadLocalRandom.current().nextInt(constants.getMAX_DUCK_ON_LOCATION());
        this.counterBuffalo=ThreadLocalRandom.current().nextInt(constants.getMAX_BUFFALO_ON_LOCATION());
        this.counterCaterpillar=ThreadLocalRandom.current().nextInt(constants.getMAX_CATERPILLAR_ON_LOCATION());
        this.counterPlant=ThreadLocalRandom.current().nextInt(constants.getMAX_PLANT_ON_LOCATION());



        arrayListVariables.add(counterWolf);
        arrayListVariables.add(counterWolf);
        arrayListVariables.add(counterWolf);
        arrayListVariables.add(counterWolf);
        arrayListVariables.add(counterWolf);
        arrayListVariables.add(counterWolf);
        arrayListVariables.add(counterWolf);
        arrayListVariables.add(counterWolf);
        arrayListVariables.add(counterWolf);

    }
        public void createAnimalOnLocation(Location location){
            ArrayList<Animals> animalsArrayListTmp = new ArrayList<Animals>();



    }
}

//    public FabricAnimal(Constants constants) {
//        this.constants = constants;
//    }
//
//    public void createAnimal(String classAnimal){
