package mainCode;

import util.Constants;
import util.Resources;

import javax.swing.*;
import java.awt.*;

/**
 * Created by achalgupta on 4/8/2016.
 */
public class MainClass {
    public static void main(String[] args) {
        JFrame mainFrame=new JFrame("Pappu Pakia 1.0.0");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        PanelClass mainPanel=new PanelClass();
        mainPanel.setPreferredSize(new Dimension(Constants.width,Constants.height));
        mainFrame.setContentPane(mainPanel);
        mainFrame.pack();
        mainFrame.setVisible(true);
        Thread thread=new Thread(new Resources());
        thread.start();

        while(true){
            mainPanel.repaint();
            try{
                Thread.sleep(10);
            }
            catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
