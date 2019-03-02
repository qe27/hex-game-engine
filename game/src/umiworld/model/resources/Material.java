package umiworld.model.resources;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Material {
    private String name;
    private List<ResourceProperty> flags = new ArrayList<>();

    public Material(String name, String flags) {
        this.name = name;
        for (String flag: flags.split(",")) {
            this.flags.add(ResourceProperty.valueOf(flag));
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ResourceProperty> getFlags() {
        return flags;
    }

    public void setFlags(List<ResourceProperty> flags) {
        this.flags = flags;
    }
}
