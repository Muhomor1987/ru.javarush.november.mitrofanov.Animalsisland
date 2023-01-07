package islandStructure;


import java.util.HashSet;
import java.util.concurrent.atomic.AtomicInteger;

public class Island {

    //Переменные

    private String name;

    private int xMax;

    private int yMax;

    private HashSet<Location> locationHashSet;

    private AtomicInteger totalLocation;
    int totalLocations;
    Location[][] locations;

    public Location[][] getLocations() {
        return locations;
    }

    public void setLocations(Location[][] locations) {
        this.locations = locations;
    }

    //Конструктор
    public Island( String name, int xMax, int yMax) {
        this.name = name;
        this.xMax = xMax;
        this.yMax = yMax;
        this.locationHashSet = new HashSet<>();
        this.totalLocation=new AtomicInteger(xMax*yMax);
        totalLocations = xMax*yMax;
        locations = new Location[xMax][yMax];
    }

//Переопределяем toString


    public AtomicInteger getTotalLocation() {
        return totalLocation;
    }

    public String getName() {
        return name;
    }

    public int getXMax() {
        return xMax;
    }

    public int getYMax() {
        return yMax;
    }


    public HashSet<Location> getLocationHashSet() {
        return locationHashSet;
    }

    public void setLocationHashSet(HashSet<Location> locationHashSet) {
        this.locationHashSet = locationHashSet;
    }

}
