package umiworld;

import umiworld.model.map.Hex;
import umiworld.rendering.DrawingPanel;

import java.awt.*;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import static umiworld.model.map.HexMap.*;
import static umiworld.model.map.HexMap.board;

/**
 * This program demonstrates how to use JPanel in Swing.
 * @author www.codejava.net
 */
public class SwingJPanelDemo extends JFrame {

    private JLabel labelUsername = new JLabel("Enter username: ");
    private JLabel labelPassword = new JLabel("Enter password: ");
    private JTextField textUsername = new JTextField(20);
    private JPasswordField fieldPassword = new JPasswordField(20);
    private JButton buttonLogin = new JButton("Login");

    public SwingJPanelDemo() {
        super("JPanel Demo Program");

        // create a new panel with GridBagLayout manager
        JPanel newPanel = new JPanel(new FlowLayout());

        GridBagConstraints constraints = new GridBagConstraints();
        constraints.anchor = GridBagConstraints.WEST;
        constraints.insets = new Insets(10, 10, 10, 10);

        newPanel.add(labelUsername);

        constraints.gridx = 1;
        newPanel.add(textUsername);

        constraints.gridx = 0;
        constraints.gridy = 1;
        newPanel.add(labelPassword);

        constraints.gridx = 1;
        newPanel.add(fieldPassword);

        constraints.gridx = 0;
        constraints.gridy = 2;
        constraints.gridwidth = 2;
        constraints.anchor = GridBagConstraints.CENTER;
        newPanel.add(buttonLogin);
        initGame();
        newPanel.add(new DrawingPanel());

        // set border for the panel
        newPanel.setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createEtchedBorder(), "Login Panel"));

        // add the panel to this frame
        add(newPanel);

        pack();
        setLocationRelativeTo(null);
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

    public static void main(String[] args) {
        // set look and feel to the system look and feel
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SwingJPanelDemo().setVisible(true);
            }
        });
    }
}