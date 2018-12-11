package umiworld.rendering;

import umiworld.HexMech;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

import static umiworld.model.HexMap.BSIZE;
import static umiworld.model.HexMap.COLOURBACK;
import static umiworld.model.HexMap.board;

public class DrawingPanel extends JPanel
{
    //mouse variables here
    //Point mPt = new Point(0,0);

    public DrawingPanel()
    {
        setBackground(COLOURBACK);
        MyMouseListener ml = new MyMouseListener();
        addMouseListener(ml);
    }


    public Dimension getPreferredSize() {
        Container c = this.getParent();
        int size = Math.min(c.getHeight(), c.getWidth());
        Dimension d = new Dimension(size,size);
        return d;
    }

    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D)g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g.setFont(new Font("TimesRoman", Font.PLAIN, 20));
        super.paintComponent(g2);
        //draw grid
        for (int i=0;i<BSIZE;i++) {
            for (int j=0;j<BSIZE;j++) {
                HexMech.drawHex(i,j,g2);
            }
        }
        //fill in hexes
        for (int i=0;i<BSIZE;i++) {
            for (int j=0;j<BSIZE;j++) {
                //if (board[i][j] < 0) hexmech.fillHex(i,j,COLOURONE,-board[i][j],g2);
                //if (board[i][j] > 0) hexmech.fillHex(i,j,COLOURTWO, board[i][j],g2);
                HexMech.fillHex(i,j,board[i][j],g2);
            }
        }

        //g.setColor(Color.RED);
        //g.drawLine(mPt.x,mPt.y, mPt.x,mPt.y);
    }

    class MyMouseListener extends MouseAdapter {	//inner class inside DrawingPanel
        public void mouseClicked(MouseEvent e) {
            int x = e.getX();
            int y = e.getY();
            //mPt.x = x;
            //mPt.y = y;
            Point p = new Point( HexMech.pxtoHex(e.getX(),e.getY()) );
            if (p.x < 0 || p.y < 0 || p.x >= BSIZE || p.y >= BSIZE) return;

            //DEBUG: colour in the hex which is supposedly the one clicked on
            //clear the whole screen first.
				/* for (int i=0;i<BSIZE;i++) {
					for (int j=0;j<BSIZE;j++) {
						board[i][j]=EMPTY;
					}
				} */

            //What do you want to do when a hexagon is clicked?
            if (board[p.x][p.y].getInfo() == null) {
                board[p.x][p.y].setInfo("" + (new Random()).nextInt(10));
            } else {
                GameScreen.informationPanel.setText(board[p.x][p.y].getInfo());
            }
            repaint();
        }
    } //end of MyMouseListener class
} // end of DrawingPanel class