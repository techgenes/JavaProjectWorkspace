import Utils.Constants;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.IOException;

/**
 * Created by achalgupta on 3/30/2016.
 */
public class DoorClass extends JPanel implements MouseListener {

    private static BufferedImage doorImage;
    private static BufferedImage thulluImage;
    private static BufferedImage treasureImage;
    private BufferedImage backgroundImage;
    private boolean isDoorOpened=false;
    private boolean isTreasure=false;
    private boolean isActive=true;

    public DoorClass(boolean isActive) {
        super();
        this.isActive=isActive;
        this.setPreferredSize(new Dimension(Constants.DOOR_WIDTH,Constants.DOOR_HEIGHT));
        this.setVisible(true);
        initImages();
        backgroundImage=doorImage;
        this.addMouseListener(this);
    }

    public void paint(Graphics g){
        super.paint(g);
        g.drawImage(backgroundImage,0,0,Constants.DOOR_WIDTH,Constants.DOOR_HEIGHT,null);

    }

    public void setBackgroundImage(boolean isDoorOpened){
        int num;
        if(isDoorOpened==true){
            num=Constants.random.nextInt(2);
            if(num==0){
                backgroundImage=thulluImage;
                isTreasure =false;
            }
            else{
                backgroundImage=treasureImage;
                isTreasure =true;
            }
        }
    }


    private void initImages(){
        doorImage=DoorClass.loadImage("resources/door.png");
        thulluImage=DoorClass.loadImage("resources/thullu.png");
        treasureImage=DoorClass.loadImage("resources/treasure.png");
    }

    private static BufferedImage loadImage(String filename){
        BufferedImage image=null;
        try{
            image= ImageIO.read(DoorClass.class.getResourceAsStream(filename));
        }
        catch(IOException e){
            e.printStackTrace();
        }
        return image;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(this.isDoorOpened==false){
            isDoorOpened=true;
        }
        else{
            isDoorOpened=false;
        }
        setBackgroundImage(isDoorOpened);

    }

    @Override
    public void mousePressed(MouseEvent e) {
        if(this.isDoorOpened==false){
            isDoorOpened=true;
        }
        else{
            isDoorOpened=false;
        }
        setBackgroundImage(isDoorOpened);
        System.out.println("Clicked");
        this.repaint();
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
