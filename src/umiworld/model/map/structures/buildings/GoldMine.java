package umiworld.model.map.structures.buildings;

import javafx.util.Pair;
import umiworld.model.Player;
import umiworld.model.map.enums.StructureType;
import umiworld.model.map.util.prerequisites.PricePrerequisite;
import umiworld.model.map.util.prerequisites.StructurePrerequisite;
import umiworld.model.resources.ResourceType;

import java.util.*;

public class GoldMine extends Mine {
    private static List<StructurePrerequisite> prerequisiteList
            = Arrays.asList(new PricePrerequisite(new HashMap<ResourceType, Integer>() {{
        put(ResourceType.STONE, 10);
        put(ResourceType.WOOD_PLANK, 100);}}));

    public GoldMine(StructureType type, Integer occupationSiteId) {
        super(type, occupationSiteId);
    }

    @Override
    public void computeEndTurn() {
        Map<ResourceType, Integer> producedResources = produce();
        for (Map.Entry<ResourceType, Integer> producedResource: producedResources.entrySet()) {
            Player.resources.put(producedResource.getKey(),
                    Player.resources.get(producedResource.getKey()) + producedResource.getValue());
        }
    }

    @Override
    public Map<ResourceType, Integer> produce() {
        return Collections.singletonMap(ResourceType.GOLDEN_ORE, 10);
    }
}
