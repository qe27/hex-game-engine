package umiworld.model.map.util.prerequisites;

import umiworld.model.Player;
import umiworld.model.map.structures.Structure;
import umiworld.model.resources.ResourceType;

import java.util.Map;

public class PricePrerequisite implements StructurePrerequisite {
    StructurePrerequisiteType prerequisiteType = StructurePrerequisiteType.PRICE;
    Map<ResourceType, Integer> price;


    public PricePrerequisite(Map<ResourceType, Integer> price) {
        this.price = price;
    }

    @Override
    public Boolean validate(Structure structure) {
        for (Map.Entry<ResourceType, Integer> currentResourcePrice: price.entrySet()) {
            if (currentResourcePrice.getValue() > Player.resources.get(currentResourcePrice.getKey())) {
                return false;
            }
        }
        return true;
    }
}