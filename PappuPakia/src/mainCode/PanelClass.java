package mainCode;

import sprites.*;
import util.Constants;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.IOException;


/**
 * Created by achalgupta on 4/8/2016.
 */
public class PanelClass extends JPanel implements KeyListener,MouseListener {
    BufferedImage pappuImage;
    FrontTrees front1;
    FrontTrees front2;
    BackTrees back1;
    BackTrees back2;
    Clouds cloud1;
    Clouds cloud2;
    Ground ground1;
    Ground ground2;
    Pappu pappu;
    Fork fork1;
    Fork fork2;

    public PanelClass() {
        //pappuImage=loadImage("images/pappu.png");
       // backTreeImage1=loadImage("images/back_trees.png");
        //backTreeImage2=loadImage("images/back_trees.png");
        front1=new FrontTrees(0,0);
        front2=new FrontTrees(Constants.width,0);
        back1=new BackTrees(0,0);
        back2=new BackTrees(Constants.width,0);
        cloud1=new Clouds(0,0);
        cloud2=new Clouds(Constants.width,0);
        ground1=new Ground(0,0);
        ground2=new Ground(Constants.width,0);
        fork1=new Fork(Constants.width,Constants.height/2);
        fork2=new Fork(3*Constants.width/2,Constants.height/2);
        pappu=new Pappu(100,Constants.height/2);
        this.requestFocus();
        this.setFocusable(true);
        this.addKeyListener(this);
        this.addMouseListener(this);
    }

    public void paint(Graphics g){
        super.paint(g);
        g.setColor(Constants.blueColor);
        g.fillRect(0,0,Constants.width,Constants.height);
        g.drawImage(cloud1.image,cloud1.x, cloud1.y,Constants.width+30,Constants.height,null);
        g.drawImage(cloud2.image,cloud2.x, cloud2.y,Constants.width+30,Constants.height,null);
//        g.drawImage(back1.image,back1.x, back1.y,Constants.width,Constants.height,null);
//        g.drawImage(back2.image,back2.x, back2.y,Constants.width,Constants.height,null);
//        g.drawImage(front1.image,front1.x,front1.y,Constants.width,Constants.height,null);
//        g.drawImage(front2.image,front2.x,front2.y,Constants.width, Constants.height,null);
        g.drawImage(fork1.image,fork1.x,fork1.y,40,Constants.height/2,null);
        g.drawImage(fork2.image,fork2.x,fork2.y,40,Constants.height/2,null);
        g.drawImage(ground1.image,ground1.x, ground1.y,Constants.width+50,Constants.height,null);
        g.drawImage(ground2.image,ground2.x, ground2.y,Constants.width+50,Constants.height,null);
        g.drawImage(pappu.image,pappu.x,pappu.y,pappu.sizeX,pappu.sizeY,null);
        front1.update();
        front2.update();
        back1.update();
        back2.update();
        cloud1.update();
        cloud2.update();
        ground1.update();
        ground2.update();
        pappu.update();
        fork2.update();
        fork1.update();
    }



    public static BufferedImage loadImage(String fileName){
        BufferedImage image=null;
        try{
            image= ImageIO.read(PanelClass.class.getResourceAsStream(fileName));
        }
        catch (IOException e){
            e.printStackTrace();
        }
        return image;
    }

    @Override
    public void keyTyped(KeyEvent e) {
//        if(e.getKeyCode()==KeyEvent.VK_UP)
//            pappu.velocityY+=-100;
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode()==KeyEvent.VK_UP) {
            pappu.velocityY += -10;
            pappu.updateAnimation();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
            pappu.velocityY+=-20;
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
