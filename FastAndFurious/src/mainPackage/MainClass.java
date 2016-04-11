package mainPackage;

import utilities.Constant;

import javax.swing.*;
import java.awt.*;

/**
 * Created by achalgupta on 4/11/2016.
 */
public class MainClass {
    public static void main(String[] args) {
        JFrame mainFrame=new JFrame("Fast and furious v1.0.0");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

       // mainFrame.setSize(640,480);

        GamePanel mainPanel=new GamePanel();

        mainPanel.setPreferredSize(new Dimension(Constant.WIDTH,Constant.HEIGHT));
        //mainFrame.add(mainPanel);
        mainFrame.setContentPane(mainPanel);
        mainPanel.setVisible(true);
        mainFrame.pack();

        mainFrame.setVisible(true);

        while(true){
            //without this panel would not be redrawn again and therefore rectangle will not appear to move
            mainPanel.repaint();
            Constant.HEIGHT=mainFrame.getHeight();
            Constant.WIDTH=mainFrame.getWidth();
        }
    }
}
