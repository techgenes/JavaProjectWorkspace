import javax.swing.*;
import java.awt.*;

/**
 * Created by achalgupta on 4/5/2016.
 */
public class MainClass {
    public static void main(String[] args) {

            JFrame frame = new JFrame("FrameGame");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           // frame.setSize(600, 400);

Menu menu=new Menu();
        //JPanel panel=new JPanel();
        //panel.setPreferredSize(new Dimension(600,400));
        menu.mainPanel.setPreferredSize(new Dimension(300,400));
        frame.setContentPane(menu.mainPanel);
        frame.pack();
        menu.mainPanel.setVisible(true);


//

//            JButton button2=new JButton("Play");
//            button2.setVisible(true);
//          //  button2.setMinimumSize(new Dimension(300,100));
//        button2.setMaximumSize(new Dimension(100,50));
//        panel.add(button2);

            frame.setVisible(true);
    }
}
