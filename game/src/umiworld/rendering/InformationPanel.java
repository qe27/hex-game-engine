package umiworld.rendering;

import javax.swing.*;

import java.awt.*;

import static umiworld.model.map.HexMap.COLOURBACK;

public class InformationPanel extends JPanel {

    public JTextArea titleTextArea, informationTextArea;
    public JButton b, b1, b2;
    public JLabel image;
//    private static String imagesBaseDir = "./game/src/resources/images/";

    public InformationPanel()
    {
        setSize(ScreenInformation.HEIGHT, ScreenInformation.HEIGHT/3);
        setBackground(COLOURBACK);
        titleTextArea = new JTextArea("text area1");
//        titleTextArea.setSize(ScreenInformation.HEIGHT, ScreenInformation.HEIGHT/6);
        informationTextArea = new JTextArea("text area2", 30, 30);
        informationTextArea.setSize(ScreenInformation.HEIGHT, ScreenInformation.HEIGHT/6);
        JPanel contents = new JPanel();
        JPanel buttons = new JPanel();

        b = new JButton("button1");
        b1 = new JButton("button2");
        b2 = new JButton("button3");
        buttons.add(b);
        buttons.add(b1);
        buttons.add(b2);
//        image = new JLabel(new ImageIcon(imagesBaseDir + "test-image.jpg"));
        contents.setLayout(new BoxLayout(contents, BoxLayout.Y_AXIS));
        contents.add(image);
        contents.add(new JScrollPane(titleTextArea));
        contents.add(new JScrollPane(informationTextArea));
        contents.add(buttons);
        this.add(contents);
    }
}
