package umiworld.model.map.structures.resourcesources;

import umiworld.model.resources.ResourceType;

public interface ResourceSource {
    ResourceType resourceType = ResourceType.GOLDEN_ORE;
    Boolean renewable = false;
    Integer quantity = 0;
}
