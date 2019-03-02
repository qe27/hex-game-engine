package umiworld.model.map.structures;

import umiworld.logic.IdManager;
import umiworld.model.map.enums.StructureType;
import umiworld.model.map.util.prerequisites.StructurePrerequisite;

import java.util.List;

public abstract class Structure {
    private StructureType type;
    private int id;
    private static List<StructurePrerequisite> prerequisiteList;

    public Structure(StructureType type, int id) {
        this.type = type;
        this.id = id;
    }

    public Structure(StructureType type) {
        this.type = type;
        this.id = IdManager.generateNewId();
    }

    abstract void computeEndTurn();

    public int getId() {
        return id;
    }

    public int regenerateId() {
        this.id = IdManager.generateNewId();
        return id;
    }

    public StructureType getType() {
        return type;
    }

    public void setType(StructureType type) {
        this.type = type;
    }

    public Boolean validate() {
        for (StructurePrerequisite prerequisite: prerequisiteList) {
            if (!prerequisite.validate(this)) {
                return false;
            }
        }
        return true;
    }

}
