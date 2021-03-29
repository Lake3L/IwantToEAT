package NotForImages;

import ForImages.DarkSquare;
import ForImages.LightSquare;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class MyPanel extends JPanel {
    BufferedImage LightSquare;
    BufferedImage DarkSquare;


    class MyKL implements KeyListener {

        @Override
        public void keyTyped(KeyEvent e) {
        }

        @Override
        public void keyPressed(KeyEvent e) {

        }

        @Override
        public void keyReleased(KeyEvent e) {
        }
    }

    class MyML implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {

        }

        @Override
        public void mousePressed(MouseEvent e) {

        }

        @Override
        public void mouseReleased(MouseEvent e) {

        }

        @Override
        public void mouseEntered(MouseEvent e) {

        }

        @Override
        public void mouseExited(MouseEvent e) {

        }
    }


    public MyPanel() {
        setLayout(null);
        addKeyListener(new MyKL());
        addMouseListener(new MyML());
        setFocusable(true);
        setPreferredSize(new Dimension(Const.W, Const.H));
        try {
            LightSquare = ImageIO.read(new File("Images\\light.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            DarkSquare = ImageIO.read(new File("Images\\dark.png"));
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }


    @Override
    public void paintComponent(Graphics g) {
        super.paintComponents(g);
        for (int yfg = 0; yfg < Const.H; yfg += Const.STEP) {
            for (int xfg = 0; xfg < Const.W; xfg += Const.STEP) {
                g.drawImage(LightSquare, 50, yfg, null);
                g.drawImage(DarkSquare, xfg, yfg, null);
            }
        }
    }
}