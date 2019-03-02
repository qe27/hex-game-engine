package umiworld.model.resources;

public enum ResourceType {
    GOLDEN_ORE (1),
    STONE(2),
    LOG(3),
    WOOD_PLANK(4);


    public Integer id;

    ResourceType(Integer id) {
        this.id = id;
    }
}
