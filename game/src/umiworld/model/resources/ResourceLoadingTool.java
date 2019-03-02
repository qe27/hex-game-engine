package umiworld.model.resources;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class ResourceLoadingTool {

    private static String baseDir = "./game/src/resources/data/resources/";


    public static Map<String, Material> loadMaterials() throws IOException {
        Map<String, Material> result = new HashMap<>();
        Properties props = new Properties();
        File dir = new File(baseDir + "materials");
        File[] directoryListing = dir.listFiles();
        for (File material: directoryListing){
            props.load(new FileInputStream(material));
            String name = props.getProperty("name");
            String flags = props.getProperty("flags");
            result.put(name, new Material(name, flags));
        }
        return result;
    }

    public static Map<String, Resource> loadResources() throws IOException {
        Map<String, Resource> result = new HashMap<>();
        Properties props = new Properties();
        File dir = new File(baseDir + "concreteresources");
        File[] directoryListing = dir.listFiles();
        for (File resource: directoryListing){
            props.load(new FileInputStream(resource));
            String name = props.getProperty("name");
            String volume = props.getProperty("volume");
            String material = props.getProperty("material");
            String flags = props.getProperty("flags");
            result.put(name, new Resource(name, volume, material, flags));
        }
        return result;
    }

}
