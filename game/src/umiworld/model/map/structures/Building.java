package umiworld.model.map.structures;

import javafx.util.Pair;
import umiworld.model.map.enums.StructureType;
import umiworld.model.resources.Resource;

import java.util.Map;

public abstract class Building extends Structure{
    protected Map<Resource, Integer> stock;

    public Building(StructureType type) {
        super(type);
    }

    public abstract void computeEndTurn();
}
