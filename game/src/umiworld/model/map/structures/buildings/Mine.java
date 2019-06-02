package umiworld.model.map.structures.buildings;

import umiworld.model.map.enums.StructureType;
import umiworld.model.map.structures.Building;
import umiworld.model.map.structures.Producible;
import umiworld.model.map.structures.Structure;

abstract public class Mine extends Building {
    public Mine(StructureType type) {
        super(type);
    }
}
