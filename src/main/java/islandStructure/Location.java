package islandStructure;

import Settins.Constants;
import organism.Animals;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;



public class Location  {

    private ArrayList<Animals> locationArrayListAnimals = new ArrayList<>();

    public ArrayList<Animals> getLocationArrayListAnimals() {
        return locationArrayListAnimals;
    }

    public void setLocationArrayListAnimals(ArrayList<Animals> locationArrayListAnimals) {
        this.locationArrayListAnimals = locationArrayListAnimals;
    }

    private int counterWolf;
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

    public Location(Constants constants) {
        this.counterWolf=ThreadLocalRandom.current().nextInt(constants.getMAX_WOLF_ON_LOCATION());
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
    }
    /*
    public Location(Constants constants) {
        this.id = System.currentTimeMillis();
        this.counterWolf=new AtomicInteger(ThreadLocalRandom.current().nextInt(constants.getMAX_WOLF_ON_LOCATION()));
        this.counterBoa=new AtomicInteger(ThreadLocalRandom.current().nextInt(constants.getMAX_BOA_ON_LOCATION()));
        this.counterFox=new AtomicInteger(ThreadLocalRandom.current().nextInt(constants.getMAX_FOX_ON_LOCATION()));
        this.counterBear=new AtomicInteger(ThreadLocalRandom.current().nextInt(constants.getMAX_BEAR_ON_LOCATION()));
        this.counterEagle=new AtomicInteger(ThreadLocalRandom.current().nextInt(constants.getMAX_EAGLE_ON_LOCATION()));
        this.counterHorse=new AtomicInteger(ThreadLocalRandom.current().nextInt(constants.getMAX_HORSE_ON_LOCATION()));
        this.counterDeer=new AtomicInteger(ThreadLocalRandom.current().nextInt(constants.getMAX_DEER_ON_LOCATION()));
        this.counterRabbit=new AtomicInteger(ThreadLocalRandom.current().nextInt(constants.getMAX_RABBIT_ON_LOCATION()));
        this.counterMouse=new AtomicInteger(ThreadLocalRandom.current().nextInt(constants.getMAX_MOUSE_ON_LOCATION()));
        this.counterGoat=new AtomicInteger(ThreadLocalRandom.current().nextInt(constants.getMAX_GOAT_ON_LOCATION()));
        this.counterBoar=new AtomicInteger(ThreadLocalRandom.current().nextInt(constants.getMAX_BOAR_ON_LOCATION()));
        this.counterDuck=new AtomicInteger(ThreadLocalRandom.current().nextInt(constants.getMAX_DUCK_ON_LOCATION()));
        this.counterBuffalo=new AtomicInteger(ThreadLocalRandom.current().nextInt(constants.getMAX_BUFFALO_ON_LOCATION()));
        this.counterCaterpillar=new AtomicInteger(ThreadLocalRandom.current().nextInt(constants.getMAX_CATERPILLAR_ON_LOCATION()));
        this.counterPlant=new AtomicInteger(ThreadLocalRandom.current().nextInt(constants.getMAX_PLANT_ON_LOCATION()));
    }

    //Одна очередь животных
    private AtomicInteger counterWolf;
    private AtomicInteger counterBoa;
    private AtomicInteger counterFox;
    private AtomicInteger counterBear;
    private AtomicInteger counterEagle;
    private AtomicInteger counterHorse;
    private AtomicInteger counterDeer;
    private AtomicInteger counterRabbit;
    private AtomicInteger counterMouse;
    private AtomicInteger counterGoat;
    private AtomicInteger counterBoar;
    private AtomicInteger counterDuck;
    private AtomicInteger counterBuffalo;
    private AtomicInteger counterCaterpillar;
    private AtomicInteger counterPlant;




    public AtomicInteger getCounterWolf() {
        return counterWolf;
    }

    public AtomicInteger getCounterBoa() {
        return counterBoa;
    }

    public AtomicInteger getCounterFox() {
        return counterFox;
    }

    public AtomicInteger getCounterBear() {
        return counterBear;
    }

    public AtomicInteger getCounterEagle() {
        return counterEagle;
    }

    public AtomicInteger getCounterHorse() {
        return counterHorse;
    }

    public AtomicInteger getCounterDeer() {
        return counterDeer;
    }

    public AtomicInteger getCounterRabbit() {
        return counterRabbit;
    }

    public AtomicInteger getCounterMouse() {
        return counterMouse;
    }

    public AtomicInteger getCounterGoat() {
        return counterGoat;
    }

    public AtomicInteger getCounterBoar() {
        return counterBoar;
    }

    public AtomicInteger getCounterDuck() {
        return counterDuck;
    }

    public AtomicInteger getCounterBuffalo() {
        return counterBuffalo;
    }

    public AtomicInteger getCounterCaterpillar() {
        return counterCaterpillar;
    }

    public AtomicInteger getCounterPlant() {
        return counterPlant;
    }
*/


}
