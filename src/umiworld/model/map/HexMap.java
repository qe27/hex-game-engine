package umiworld.model.map;

import java.awt.*;

public class HexMap {
    //constants and global variables
    public static Color COLOURBACK =  Color.WHITE;
    public static Color COLOURCELL =  Color.ORANGE;
    public static Color COLOURGRID =  Color.BLACK;
    public static Color COLOURONE = new Color(255,255,255,200);
    public static Color COLOURONETXT = Color.BLUE;
    public static Color COLOURTWO = new Color(0,0,0,200);
    public static Color COLOURTWOTXT = new Color(255,100,255);
    public static int EMPTY = 0;
    public static int BSIZE = 12; //board size.
    public static int HEXSIZE = 60;	//hex size in pixels
    public static int BORDERS = 15;
    public static int SCRSIZE = HEXSIZE * (BSIZE + 1) + BORDERS*3; //screen size (vertical dimension).

    public static Hex[][] board = new Hex[BSIZE][BSIZE];

    public static void endTurn() {
        return;
    }
}