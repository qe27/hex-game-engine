package umiworld.model;

public class Hex {
    private Integer x,y;
    private String info;

    public Hex(Integer x, Integer y, String info) {
        this.x = x;
        this.y = y;
        this.info = info;
    }

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
