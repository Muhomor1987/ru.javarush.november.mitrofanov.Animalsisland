package util;

import Settins.Constants;
import islandStructure.Island;
import islandStructure.Location;


import java.util.Iterator;

public class CreateLocation implements Runnable {
    Island island;
    Constants constants;

    public CreateLocation(Island island, Constants constants) {
        this.island = island;
        this.constants = constants;
    }

    @Override
    public void run() {
        while (island.getTotalLocation().decrementAndGet() >= 0) {
            Location location = new Location(constants);
            island.getLocationHashSet().add(location);
        }
    }

    public void arrangeLocation() {
        Iterator<Location> locationIterator = island.getLocationHashSet().iterator();

        for (int i = 0; i < island.getXMax(); i++) {
            for (int j = 0; j < island.getYMax(); j++) {
                Location next = locationIterator.next();
                island.getLocations()[i][j] = next;
            }
        }
    }
}
