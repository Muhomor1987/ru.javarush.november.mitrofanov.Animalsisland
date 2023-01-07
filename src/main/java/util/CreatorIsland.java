package util;

import Settins.Constants;
import islandStructure.Island;


public class CreatorIsland {
    Constants constants;
    public CreatorIsland(Constants constants) {
        this.constants = constants;
    }
    public Island createIsland() {

        return new Island(
                constants.getNameIsland(),
                constants.getX_MAX(),
                constants.getY_MAX());
    }
}

