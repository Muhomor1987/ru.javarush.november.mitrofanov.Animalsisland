package org.example;

import Settins.Constants;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlFactory;
import islandStructure.Island;
import organism.entities.Animal;
import organism.entities.units.Wolf;
import util.CreateLocation;
import util.CreatorIsland;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

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
        createLocation.run();
        createLocation.arrangeLocation();
        System.out.println(island.getLocationHashSet().size());



    }
}