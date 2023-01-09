package org.example;

import Settins.Constants;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import islandStructure.Island;
import util.CreateLocation;
import util.CreatorIsland;

import java.util.Arrays;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        //Constant загружаем из файла
        ObjectMapper objectMapper = new ObjectMapper(new JsonFactory());
        objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
        Constants constants = new Constants();

/*       ошибка востоновления из файла файал записывается в разнобой
            try {
            objectMapper.writeValue(new File("src/main/java/IslandSettings.xml"),constantstmp);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        File file = new File("src/main/java/IslandSettings.xml");
        try {
            Constants constant = objectMapper.readValue(file, Constants.class);
            objectMapper.writeValue(new File("src/main/java/IslandSettings2"), constant);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }*/

        CreatorIsland creatorIsland = new CreatorIsland(constants);
        Island island = creatorIsland.createIsland();
        CreateLocation createLocation = new CreateLocation(island,constants);
        Thread thread = new Thread(createLocation);
        ExecutorService executorService = Executors.newWorkStealingPool();
        for (int i = 0; i < 4; i++) {
            executorService.execute(thread);
        }

        createLocation.arrangeLocation();
        //Test
        System.out.println(island);
        System.out.println(island.getLocationHashSet().size());
        System.out.println(island.getLocations()[99][19]);




    }
}