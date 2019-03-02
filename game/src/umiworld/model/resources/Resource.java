package umiworld.model.resources;


import umiworld.Test;

import java.util.ArrayList;
import java.util.List;

public class Resource {
    private String name;
    private Integer volume;
    private Material material;
    private List<ResourceProperty> flags = new ArrayList<>();

    public Resource(String name, String volume, String material, String newFlags) {
        this.name = name;
        this.volume = Integer.valueOf(volume);
        this.material = Test.materialsMap.get(material);
        this.flags = this.material.getFlags();
        if (newFlags != null && !newFlags.isEmpty()) {
            for (String newFlag : newFlags.split(",")) {
                this.flags.add(ResourceProperty.valueOf(newFlag));
            }
        }
    }
}