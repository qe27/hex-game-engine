package umiworld.rendering;

import javax.swing.*;

import static umiworld.model.map.HexMap.COLOURBACK;

public class InformationPanel extends JTextArea {

    public InformationPanel()
    {
        setSize(ScreenInformation.HEIGHT, ScreenInformation.HEIGHT/3 );
        setBackground(COLOURBACK);
    }
}
