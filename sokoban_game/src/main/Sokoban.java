package sokoban_game.src.main;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.imageio.ImageIO.*;
import javax.swing.JPanel;

public class Sokoban extends Frame {

    TextField tf;

    public Sokoban() {
        MyPanel panel = new MyPanel();
        panel.setBounds(0, 0, 300, 300);
        // panel.setBackground(Color.gray);
        // panel.setSize(new Dimension(1000, 500));
        panel.repaint();
        add(panel);
        setSize(500, 500);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) throws IOException {
        int width = 250;
        int height = 250;
 

        Sokoban s = new Sokoban();
        // Peg peg = new Peg(0,1);
        // Image img = peg.getImage();
        // if (img==null) System.out.println("NO image");
        // else System.out.println("find image");
    }


    private class MyPanel extends JPanel{

        @Override
        public void paintComponents(Graphics g){
            super.paintComponents(g);
            System.out.println("paintComponents()");

            // Peg peg = new Peg(0,0);
            // Image img = peg.getImage();
            // System.out.println(img.getHeight(null));

            BufferedImage img = null;
            try {
                img = ImageIO.read(new File("sokoban_game/resources/myimage.jpg"));
            } catch (IOException e) {
            }
            g.drawImage(img, 100, 100, null);
            // repaint();
        }

    }
}
