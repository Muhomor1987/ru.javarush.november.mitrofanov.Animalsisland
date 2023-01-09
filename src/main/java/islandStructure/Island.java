package islandStructure;


import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Island {

    //Переменные

    private String name;

    private int xMax;

    private int yMax;

    private HashSet<Location> locationHashSet;

    private AtomicInteger totalLocation;

    private int totalLocations;

    private Location[][] locations  ;


    //Конструктор

    public Island( String name, int xMax, int yMax) {
        this.name = name;
        this.xMax = xMax;
        this.yMax = yMax;
        locations = new Location[xMax][yMax];
        this.locationHashSet = new HashSet<>();
        totalLocations = xMax*yMax;
        this.totalLocation=new AtomicInteger(totalLocations);
    }

//Переопределяем toString

    @Override
    public String toString() {

        return "Island{" +
                "name='" + name + '\'' +
                ", xMax=" + xMax +
                ", yMax=" + yMax +
                ", locationHashSet=" + locationHashSet.size() +
                ", totalLocation=" + totalLocation +
                ", totalLocations=" + totalLocations +
                ", locations=" + Arrays.toString(locations) +
                '}';
    }

    public Location[][] getLocations() {
        return locations;
    }

    public void setLocations(Location[][] locations) {
        this.locations = locations;
    }

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
