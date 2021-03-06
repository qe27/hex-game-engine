package umiworld;

import umiworld.model.map.Hex;
import umiworld.rendering.GameScreen;

import javax.swing.*;

import static umiworld.model.map.HexMap.*;

/**********************************
 This is the main class of a Java program to play a game based on hexagonal tiles.
 The mechanism of handling hexes is in the file hexmech.java.

 Written by: M.H.
 Date: December 2012

 ***********************************/

public class HexGame
{
    private HexGame() {
        initGame();

        GameScreen.init();
    }

    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new HexGame();
            }
        });
    }

    void initGame(){

        HexMech.setXYasVertex(false); //RECOMMENDED: leave this as FALSE.

        HexMech.setHeight(HEXSIZE); //Either setHeight or setSize must be run to initialize the hex
        HexMech.setBorders(BORDERS);

        for (int i=0;i<BSIZE;i++) {
            for (int j=0;j<BSIZE;j++) {
                board[i][j] = new Hex(i, j, null);
            }
        }

        //set up board here
        board[3][3].setInfo("A");
        board[4][3].setInfo("Q");
        board[4][4].setInfo("B");
    }

 /*   private void createAndShowGUI()
    {
        DrawingPanel drawingPanel = new DrawingPanel();
        InformationPanel informationPanel = new InformationPanel();


        informationPanel.setText("aaaa");

//        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("Hex Testing 4");
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        Container content = frame.getContentPane();
        JPanel aggregationFrame = new JPanel();
        aggregationFrame.add(drawingPanel, BorderLayout.CENTER);
        aggregationFrame.add(informationPanel, BorderLayout.EAST);
        content.add(aggregationFrame);
        //this.add(panel);  -- cannot be done in a static context
        //for hexes in the FLAT orientation, the height of a 10x10 grid is 1.1764 * the width. (from h / (s+t))
        frame.pack();
        frame.setSize(WIDTH, HEIGHT);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setResizable(false);
        frame.setLocationRelativeTo( null );
        frame.setVisible(true);
    }*/
}
