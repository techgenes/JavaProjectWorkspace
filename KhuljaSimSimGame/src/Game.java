import javax.swing.*;
import java.awt.*;

/**
 * Created by achalgupta on 3/30/2016.
 */
public class Game extends JFrame {

    private boolean activeDoors=true;

    public Game(String name){
        super(name);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        GamePanel mainPanel=new GamePanel();
        this.setContentPane(mainPanel.mainPanel);
        this.pack();
        this.setVisible(true);
    }


}
