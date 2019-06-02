package umiworld.model.map.structures.buildings;

import umiworld.model.Player;
import umiworld.model.map.enums.StructureType;
import umiworld.model.map.util.prerequisites.PricePrerequisite;
import umiworld.model.map.util.prerequisites.StructurePrerequisite;
import umiworld.model.resources.GoldenOre;

import java.util.*;

public class GoldMine extends Mine {


    public GoldMine(StructureType type) {
        super(type);
    }

    @Override
    public void computeEndTurn() {
        Player.resources.merge(GoldenOre.getInstanse(), 10, Integer::sum);
    }
}
