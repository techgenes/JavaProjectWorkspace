import Utils.Constants;

import javax.swing.*;
import java.awt.*;

/**
 * Created by achalgupta on 3/30/2016.
 */
public class GamePanel{
    private JButton resetButton;
    public JPanel door1;
    public JPanel door2;
    public JPanel door3;
    private JLabel score;
    private JLabel tagLine;
    public JPanel mainPanel;


    private void createUIComponents() {
        // TODO: place custom component creation code here
        door1=new DoorClass(true);
        door2=new DoorClass(true);
        door3=new DoorClass(true);
    }
}
