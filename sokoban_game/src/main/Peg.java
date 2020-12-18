package sokoban_game.src.main;

// import java.awt.Button;
import java.awt.Image;
import javax.swing.ImageIcon;


public class Peg{

    private Image image;

    public Peg(int x, int y){
        System.out.println("peg constructor");
        initPeg();
    }

    public Image getImage(){
        return image;
    }
    private void setImage(Image img){
        image = img;
    }

    private void initPeg(){
        System.out.println("initPeg()");
        ImageIcon iicon = new ImageIcon("sokoban_game/src/resources/myimage.jpg");
        Image img = iicon.getImage();
        if (img != null) {
            System.out.println("get the image!");
        }else{
            System.out.println("NO image found");
        }
        setImage(img);
    }

    // public static void main(String[] args){
    //     Peg peg = new Peg(0,1);
    // }

}
