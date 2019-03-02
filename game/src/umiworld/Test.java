package umiworld;

import umiworld.model.resources.Material;
import umiworld.model.resources.Resource;
import umiworld.model.resources.ResourceLoadingTool;

import java.io.IOException;
import java.util.Map;

public class Test {

    public static Map<String, Material> materialsMap;
    public static Map<String, Resource> resourcesMap;

    public static void main(String[] args) {
        try {
            materialsMap = ResourceLoadingTool.loadMaterials();
            resourcesMap = ResourceLoadingTool.loadResources();
            System.out.println(materialsMap);
            System.out.println(resourcesMap);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
