package umiworld.model.resources;

public class GoldenOre extends Resource {
    private static GoldenOre instanse;

    public static GoldenOre getInstanse() {
        if (instanse == null) {
            instanse = new GoldenOre();
        }
        return instanse;
    }

    private GoldenOre() {
        this.name = "Golden ore";
        this.volume = 2;
    }

}
