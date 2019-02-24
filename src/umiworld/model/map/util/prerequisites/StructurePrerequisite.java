package umiworld.model.map.util.prerequisites;

import umiworld.model.map.structures.Structure;

import static umiworld.model.map.util.prerequisites.StructurePrerequisiteType.PRICE;

public interface StructurePrerequisite {
    StructurePrerequisiteType prerequisiteType = PRICE;
    Boolean validate(Structure structure);
}
