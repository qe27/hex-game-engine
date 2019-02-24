package umiworld.model.map;

import umiworld.model.map.enums.TerrainType;
import umiworld.model.map.structures.Structure;

import java.util.ArrayList;
import java.util.List;

public class HexStructure {
    private TerrainType terrain;
    private List<Structure> structureList;

    public HexStructure() {
        terrain = TerrainType.SEA;
        structureList = new ArrayList<>();
    }

    public void addStructure(Structure structure) {
        structureList.add(structure);
    }

    public void removeStructure() {

    }

}
