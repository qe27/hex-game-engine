package umiworld.rendering;

import javax.swing.*;
import java.awt.*;

import static umiworld.rendering.ScreenInformation.HEIGHT;
import static umiworld.rendering.ScreenInformation.WIDTH;

public class GameScreen {


    public static DrawingPanel drawingPanel;
    public static InformationPanel informationPanel;
    public static JFrame frame;
    public static JPanel aggregationFrame;

    public static void init()
    {
        drawingPanel = new DrawingPanel();
        informationPanel = new InformationPanel();
//        informationPanel.setText("aaaa");
        frame = new JFrame("Hex Testing 4");
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        Container content = frame.getContentPane();
        aggregationFrame = new JPanel();
        aggregationFrame.add(drawingPanel, BorderLayout.CENTER);
        aggregationFrame.add(informationPanel, BorderLayout.EAST);
        content.add(aggregationFrame);
        frame.pack();
        frame.setSize(WIDTH, HEIGHT);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setResizable(false);
        frame.setLocationRelativeTo( null );
        frame.setVisible(true);
    }


}
