package umiworld.model.resources;

public enum ResourceProperty {
    STONE ("stone"),
    BUILD_MATERIAL ("build_material"),
    METAL ("metal"),
    WOOD ("wood"),
    BURNABLE ("burnable"),
    ORE ("ore"),
    MELTABLE ("meltable"),
    PLANK ("plank");

    public String id;

    ResourceProperty(String id) {
        this.id = id;
    }
}
