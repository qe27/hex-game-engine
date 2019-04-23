package umiworld.model.map.structures.buildings;

import umiworld.model.map.enums.StructureType;
import umiworld.model.map.structures.Building;
import umiworld.model.resources.Resource;

import java.util.Map;

public abstract class ProducerBuilding extends Building {
    Map<Resource, Integer> producingMap;

    public ProducerBuilding(StructureType type) {
        super(type);
    }

    public void computeEndTurn() {
        producingMap.forEach((resource, quantity) -> stock.merge(resource, quantity, (a, b) -> a + b));
    }

}
