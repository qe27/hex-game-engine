package umiworld.model.map.structures.buildings;

import umiworld.model.map.enums.StructureType;
import umiworld.model.map.structures.Building;
import umiworld.model.map.structures.Producible;
import umiworld.model.map.structures.Structure;

public abstract class Mine extends Building implements Producible {
    private Integer occupationSiteId;

    public Mine(StructureType type, Integer occupationSiteId) {
        super(type);
        this.occupationSiteId = occupationSiteId;
    }
}
