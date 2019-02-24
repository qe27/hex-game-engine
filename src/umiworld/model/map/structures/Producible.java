package umiworld.model.map.structures;

import umiworld.model.resources.ResourceType;

import java.util.Map;

public interface Producible {
    Map<ResourceType, Integer> produce();
}
