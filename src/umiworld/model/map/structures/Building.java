package umiworld.model.map.structures;

import javafx.util.Pair;
import umiworld.model.map.enums.StructureType;

public abstract class Building extends Structure{
    private int price;

    public Building(StructureType type) {
        super(type);
    }

    public abstract void computeEndTurn();
}
