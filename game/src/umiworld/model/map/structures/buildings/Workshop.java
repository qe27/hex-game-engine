package umiworld.model.map.structures.buildings;

import javafx.util.Pair;
import umiworld.model.map.enums.StructureType;
import umiworld.model.map.structures.Building;
import umiworld.model.resources.Resource;

import java.util.List;
import java.util.Map;
import java.util.function.Function;

public abstract class Workshop extends Building {
    List<Function<Pair<Resource, Integer>, Pair<Resource, Integer>>>  processingMap;

    public Workshop(StructureType type) {
        super(type);
    }

    public void computeEndTurn() {
        System.out.println("End of turn. Processing some");
    }
}
